package com.qf.tcp0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_service {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String msg = br.readLine();
		System.out.println("收到来自"+InetAddress.getLocalHost()+"的消息："+msg);
		
		ss.close();
	}
}
