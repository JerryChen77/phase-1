package com.qf.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01 {
	public static void main(String[] args) throws UnknownHostException {
		/**
		static InetAddress getLocalHost() 
		返回本地主机。 
			static InetAddress[] getAllByName(String host) 
			          在给定主机名的情况下，根据系统上配置的名称服务返回其 IP 地址所组成的数组。
			static InetAddress getByName(String host) 
			          在给定主机名的情况下确定主机的 IP 地址。 
			          
			String getCanonicalHostName() 
			          获取此 IP 地址的完全限定域名。 
			String getHostAddress() 
			          返回 IP 地址字符串（以文本表现形式）。 
			String getHostName() 
			          获取此 IP 地址的主机名。 
		 *  byte[] getAddress() 
			          返回此 InetAddress 对象的原始 IP 地址。 
		 */
		InetAddress a = InetAddress.getLocalHost();
		System.out.println(a+"=============");
		// 获取当前主机的主机名和地址
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
