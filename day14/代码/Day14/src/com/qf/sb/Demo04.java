package com.qf.sb;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *	删
			 StringBuffer delete(int start, int end) 
			          移除此序列的子字符串中的字符。 
			 StringBuffer deleteCharAt(int index) 
			          移除此序列指定位置的 char。 
			          
		 * 	改
			 StringBuffer replace(int start, int end, String str) 
			          使用给定 String 中的字符替换此序列的子字符串中的字符。 
			 StringBuffer reverse() 
			          将此字符序列用其反转形式取代。 
			 void setCharAt(int index, char ch) 
			          将给定索引处的字符设置为 ch。 
			 void setLength(int newLength) 
			          设置字符序列的长度。 
			 void trimToSize() 
			          尝试减少用于字符序列的存储空间。 
			          
		 * 	查
			 int capacity() 
			          返回当前容量。 
			 char charAt(int index) 
			          返回此序列中指定索引处的 char 值。 
			 int codePointAt(int index) 
			          返回指定索引处的字符（统一代码点）。 
			 int indexOf(String str) 
			          返回第一次出现的指定子字符串在该字符串中的索引。 
			 int indexOf(String str, int fromIndex) 
			          从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。 
			 int lastIndexOf(String str) 
			          返回最右边出现的指定子字符串在此字符串中的索引。 
			 int lastIndexOf(String str, int fromIndex) 
			          返回最后一次出现的指定子字符串在此字符串中的索引。 
			 int length() 
			          返回长度（字符数）。 
			 String substring(int start) 
			          返回一个新的 String，它包含此字符序列当前所包含的字符子序列。 
			 String substring(int start, int end) 
			          返回一个新的 String，它包含此序列当前所包含的字符子序列。 
			 
		 * 	其他
			 void ensureCapacity(int minimumCapacity) 
			          确保容量至少等于指定的最小值。 
			 String toString() 
			          返回此序列中数据的字符串表示形式。 
		 */
		
		StringBuffer buffer1 = new StringBuffer("床前明月光,疑是地上霜.");
		System.out.println(buffer1);
		
		buffer1.deleteCharAt(2);
		System.out.println(buffer1);
		
		buffer1.delete(0, 3);
		System.out.println(buffer1);
		
		StringBuffer buffer2 = new StringBuffer("abcdefghijklmn");
		buffer2.replace(0, 7, "ABCDEFG");
		System.out.println(buffer2);
		
		buffer2.reverse();
		System.out.println(buffer2);
		buffer2.reverse();
		System.out.println(buffer2);
		
		buffer2.setCharAt(buffer2.length()-1, 'N');
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
		buffer2.setLength(50);
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
		// 把容量调整的和length一致
		buffer2.trimToSize();
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
	}
}
