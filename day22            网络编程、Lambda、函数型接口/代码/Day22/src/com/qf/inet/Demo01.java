package com.qf.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01 {
	public static void main(String[] args) throws UnknownHostException {
		/**
		static InetAddress getLocalHost() 
		���ر��������� 
			static InetAddress[] getAllByName(String host) 
			          �ڸ���������������£�����ϵͳ�����õ����Ʒ��񷵻��� IP ��ַ����ɵ����顣
			static InetAddress getByName(String host) 
			          �ڸ����������������ȷ�������� IP ��ַ�� 
			          
			String getCanonicalHostName() 
			          ��ȡ�� IP ��ַ����ȫ�޶������� 
			String getHostAddress() 
			          ���� IP ��ַ�ַ��������ı�������ʽ���� 
			String getHostName() 
			          ��ȡ�� IP ��ַ���������� 
		 *  byte[] getAddress() 
			          ���ش� InetAddress �����ԭʼ IP ��ַ�� 
		 */
		InetAddress a = InetAddress.getLocalHost();
		System.out.println(a+"=============");
		// ��ȡ��ǰ�������������͵�ַ
		InetAddress address01 = InetAddress.getLocalHost();
		System.out.println(address01);
		
		System.out.println(address01.getHostAddress());
		System.out.println(address01.getHostName());
		
		InetAddress address02 = InetAddress.getByName("www.baidu.com");
		System.out.println("02"+address02);
		
		InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : addresses) {
			System.out.println(inetAddress);
		}
	}
}
