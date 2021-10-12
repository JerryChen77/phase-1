package com.qf.set;

import java.util.HashSet;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashSet() 
			          ����һ���µĿ� set����ײ� HashMap ʵ����Ĭ�ϳ�ʼ������ 16������������ 0.75�� 
			HashSet(Collection<? extends E> c) 
			          ����һ������ָ�� collection �е�Ԫ�ص��� set�� 
			HashSet(int initialCapacity) 
			          ����һ���µĿ� set����ײ� HashMap ʵ������ָ���ĳ�ʼ������Ĭ�ϵļ������ӣ�0.75���� 
			HashSet(int initialCapacity, float loadFactor) 
			          ����һ���µĿ� set����ײ� HashMap ʵ������ָ���ĳ�ʼ������ָ���ļ������ӡ� 
		 */
		// ����һ���µĿ� set����ײ� HashMap ʵ����Ĭ�ϳ�ʼ������ 16������������ 0.75�� 
		HashSet<String> set01 = new HashSet<String>();
		set01.add("abc");
		System.out.println(set01);
		System.out.println(set01.size());
		
		HashSet<String> set02 = new HashSet<String>(set01);
		System.out.println(set02);
		
		HashSet<String> set03 = new HashSet<String>(10000);
		System.out.println(set03);
		System.out.println(set03);
		
		HashSet<String> set04 = new HashSet<String>(10000,0.8F);
		System.out.println(set04);
		
	}
}
