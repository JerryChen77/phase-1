package com.qf.sys;

import java.util.Map;
import java.util.Properties;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  static long currentTimeMillis() 
			          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣 
			static Map<String,String> getenv() 
			          ����һ�������޸ĵĵ�ǰϵͳ�������ַ���ӳ����ͼ�� 
			static String getenv(String name) 
			          ��ȡָ���Ļ�������ֵ�� 
			static Properties getProperties() 
			          ȷ����ǰ��ϵͳ���ԡ� 
			static String getProperty(String key) 
			          ��ȡָ����ָʾ��ϵͳ���ԡ� 
			static void exit(int status) 
			          ��ֹ��ǰ�������е� Java ������� 
			static void gc() 
			          ���������������� 
		 */
		// ��1970��1��1�յ���ǰ�ĺ���ֵ
		System.out.println(System.currentTimeMillis());
		// ��ȡϵͳ������Ϣ
		Map<String, String> map = System.getenv();
		System.out.println(map);
		
		// ��ȡjava�������
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		String property = System.getProperty("os.name");
		System.out.println(property);
	}
}
