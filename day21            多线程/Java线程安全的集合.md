## Java线程安全的集合

### **一、线程安全的集合**

​        JDK1.5之前，可以使用Venctor和Hashtable，也可以由java.util.Collections来创建线程安全的集合，如：Connections.synchronizedSet(Set<T>); 

Connections.synchronizedList(List<T>);

Connections.synchronizedMap(Map<K, V>)等，

其简单的原理是每个方法都增加了synchronized来保证线程安全。

JDK1.5之后，提供了java.util.concurrent并发包，它提供的新集合类允许通过在语义中的少量更改来获得更高的并发。

- CopyOnWriteArrayList 其中的set、add、remove等方法，都使用了ReentrantLock的lock()来加锁，unlock()来解锁。当增加元素的时候使用Arrays.copyOf()来拷贝副本，在副本上增加元素，然后改变原引用指向副本。
- CopyOnWriteArraySet 使用了CopyOnWriteArrayList来存储数据，remove方法调用CopyOnWriteArrayList的remove方法。add方法调用了CopyOnWriteArrayList的addIfAbsent方法，addIfAbsent同样使用了ReentrantLock的lock()来加锁，unlock()来解锁。 
- ConcurrentHashMap允许多个修改操作并发进行，其关键在于使用了锁分离技术。它使用了多个锁来控制对hash表的不同部分进行的修改。ConcurrentHashMap内部使用段(Segment)来表示这些不同的部分，每个段其实就是一个小的hash table，它们有自己的锁（由ReentrantLock来实现的）。只要多个修改操作发生在不同的段上，它们就可以并发进行。

### 二、Collections包装方法
Vector和HashTable被弃用后，它们被ArrayList和HashMap代替，但它们不是线程安全的，所以Collections工具类中提供了相应的包装方法把它们包装成线程安全的集合

```
List<E> synArrayList = Collections.synchronizedList(new ArrayList<E>());

Set<E> synHashSet = Collections.synchronizedSet(new HashSet<E>());

Map<K,V> synHashMap = Collections.synchronizedMap(new HashMap<K,V>());Collections针对每种集合都声明了一个线程安全的包装类，在原集合的基础上添加了锁对象，集合中的每个方法都通过这个锁对象实现同步
```

### **三、 java.util.concurrent包的锁** 

**锁定和原子之Lock**

​    Java 语言内置了锁定工具 -- synchronized 关键字。当线程获得监视器时（内置锁定），其他线程如果试图获得相同锁定，那么它们将被阻塞，直到第一个线程释放该锁定。同步还确保随后获得相同锁定的线程可以看到之前的线程在具有该锁定时所修改的变量的值，从而确保如果类正确地同步了共享状态的访问权，那么线程将不会看到变量的"失效"值，这是缓存或编译器优化的结果。

​    虽然同步没有什么问题，但它有一些限制，在一些高级应用程序中会造成不便。Lock 接口将内置监视器锁定的锁定行为普遍化，允许多个锁定实现，同时提供一些内置锁定缺少的功能，如计时的等待、可中断的等待、锁定轮询、每个锁定有多个条件等待集合以及无阻塞结构的锁定。



```
public interface Lock {
    void lock();
    void lockInterruptibly() throws InterruptedException;
    boolean tryLock();
    boolean tryLock(long time, TimeUnit unit) throws InterruptedException;
    void unlock();
    Condition newCondition();
}
```

 **ReentrantLock**

​    ReentrantLock 是具有与隐式监视器锁定（使用 synchronized 方法和语句访问）相同的基本行为和语义的 Lock 的实现，但它具有扩展的能力。

​    作为额外收获，在竞争条件下，ReentrantLock 的实现要比现在的 synchronized 实现更具有可伸缩性。（有可能在 JVM 的将来版本中改进 synchronized 的竞争性能。）

​    这意味着当许多线程都竞争相同锁定时，使用 ReentrantLock 的吞吐量通常要比 synchronized 好。换句话说，当许多线程试图访问 ReentrantLock 保护的共享资源时，JVM 将花费较少的时间来调度线程，而用更多个时间执行线程。

​    虽然 ReentrantLock 类有许多优点，但是与同步相比，它有一个主要缺点 -- 它可能忘记释放锁定。建议当获得和释放 ReentrantLock 时使用下列结构：



```
Lock lock = new ReentrantLock();
//...
lock.lock();
try {
  // perform operations protected by lock
}
catch(Exception ex) {
 // restore invariants
}finally {
  lock.unlock();
}
```

 **Condition**

​    就像 Lock 接口是同步的具体化，Condition 接口是 Object 中 wait() 和 notify() 方法的具体化。Lock 中的一个方法是 newCondition()，它要求锁定向该锁定返回新的 Condition 对象限制。await()、signal() 和 signalAll() 方法类似于 wait()、notify() 和 notifyAll()，但增加了灵活性，每个 Lock 都可以创建多个条件变量。这简化了一些并发算法的实现。

**ReadWriteLock**

​    ReentrantLock 实现的锁定规则非常简单 -- 每当一个线程具有锁定时，其他线程必须等待，直到该锁定可用。有时，当对数据结构的读取通常多于修改时，可以使用更复杂的称为读写锁定的锁定结构，它允许有多个并发读者，同时还允许一个写入者独占锁定。该方法在一般情况下（只读）提供了更大的并发性，同时在必要时仍提供独占访问的安全性。ReadWriteLock 接口和 ReentrantReadWriteLock 类提供这种功能 -- 多读者、单写入者锁定规则，可以用这种功能来保护共享的易变资源。

 ###  **四、原子变量**

​    即使大多数用户将很少直接使用它们，原子变量类（AtomicInteger、AtomicLong、AtomicReference 等等）也有充分理由是最显著的新并发类。这些类公开对 JVM 的低级别改进，允许进行具有高度可伸缩性的原子读-修改-写操作。大多数现代 CPU 都有原子读-修改-写的原语，比如比较并交换（CAS）或加载链接/条件存储（LL/SC）。原子变量类使用硬件提供的最快的并发结构来实现。

​    许多并发算法都是根据对计数器或数据结构的比较并交换操作来定义的。通过暴露高性能的、高度可伸缩的 CAS 操作（以原子变量的形式），用 Java 语言实现高性能、无等待、无锁定的并发算法已经变得可行。

​    几乎 java.util.concurrent 中的所有类都是在 ReentrantLock 之上构建的，ReentrantLock 则是在原子变量类的基础上构建的。所以，虽然仅少数并发专家使用原子变量类，但 java.util.concurrent 类的很多可伸缩性改进都是由它们提供的。

​    原子变量主要用于为原子地更新"热"字段提供有效的、细粒度的方式，"热"字段是指由多个线程频繁访问和更新的字段。另外，原子变量还是计数器或生成序号的自然机制。

```
参考博文：
java.util.concurrent介绍 
ConcurrentHashMap之实现细节
```

