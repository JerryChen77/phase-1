package com.qf.tcp0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1������Socket����,ָ��IP��Port
 * 2����ȡ�����
 * 3����������
 * 4�����ջظ�
 * 5���ر�
 * @author Dushine2008
 *
 */
public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1������Socket����,ָ��IP��Port
		Socket socket = new Socket("10.31.154.53", 5678);
		
		// 2����ȡ�����
		OutputStream os = socket.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));
		
		// 3����������
		writer.write("��������");
		writer.flush();
		// 5���ر�
		socket.close();
	}
}
