package com.qf.tcp1;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * 1������Socket����
 * 2������������--׼���ļ���Ϣ
 * 3����ȡ�����--����ļ���Ϣ
 * 4���ļ���Ϣ���ļ����ݺϲ�����
 * 5����д����
 * 6���ر�����
 * @author Dushine2008
 *
 */
public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1������Socket����
		Socket socket = new Socket("10.31.154.53", 6677);
		
		// 2������������--׼���ļ���Ϣ
		File file = new File("D:/threeCountry.txt");
		FileInputStream fis = new FileInputStream(file);
		
		// 3����ȡ�����--����ļ���Ϣ
		OutputStream os = socket.getOutputStream();
		
		// ��ȡ�ļ����ֵ��ֽ�����
		byte[] bs = file.getName().getBytes();
		
		// ȷ��ÿһ������ĳ��ȶ���256
		byte[] bytes = Arrays.copyOf(bs, 256);
		
		// 4���ļ���Ϣ���ļ����ݺϲ�����
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		SequenceInputStream sis = new SequenceInputStream(bais, fis);
		
		// 5����д����
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = sis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println("�ļ��ϴ��ɹ�...");
		fis.close();
		socket.close();
	}
}
