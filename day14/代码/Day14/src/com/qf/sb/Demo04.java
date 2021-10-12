package com.qf.sb;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *	ɾ
			 StringBuffer delete(int start, int end) 
			          �Ƴ������е����ַ����е��ַ��� 
			 StringBuffer deleteCharAt(int index) 
			          �Ƴ�������ָ��λ�õ� char�� 
			          
		 * 	��
			 StringBuffer replace(int start, int end, String str) 
			          ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ��� 
			 StringBuffer reverse() 
			          �����ַ��������䷴ת��ʽȡ���� 
			 void setCharAt(int index, char ch) 
			          ���������������ַ�����Ϊ ch�� 
			 void setLength(int newLength) 
			          �����ַ����еĳ��ȡ� 
			 void trimToSize() 
			          ���Լ��������ַ����еĴ洢�ռ䡣 
			          
		 * 	��
			 int capacity() 
			          ���ص�ǰ������ 
			 char charAt(int index) 
			          ���ش�������ָ���������� char ֵ�� 
			 int codePointAt(int index) 
			          ����ָ�����������ַ���ͳһ����㣩�� 
			 int indexOf(String str) 
			          ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е������� 
			 int indexOf(String str, int fromIndex) 
			          ��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е������� 
			 int lastIndexOf(String str) 
			          �������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е������� 
			 int lastIndexOf(String str, int fromIndex) 
			          �������һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
			 int length() 
			          ���س��ȣ��ַ������� 
			 String substring(int start) 
			          ����һ���µ� String�����������ַ����е�ǰ���������ַ������С� 
			 String substring(int start, int end) 
			          ����һ���µ� String�������������е�ǰ���������ַ������С� 
			 
		 * 	����
			 void ensureCapacity(int minimumCapacity) 
			          ȷ���������ٵ���ָ������Сֵ�� 
			 String toString() 
			          ���ش����������ݵ��ַ�����ʾ��ʽ�� 
		 */
		
		StringBuffer buffer1 = new StringBuffer("��ǰ���¹�,���ǵ���˪.");
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
		
		// �����������ĺ�lengthһ��
		buffer2.trimToSize();
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
	}
}
