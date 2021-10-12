package com.qf.tcp0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1、创建ServerSocket,明确服务端端口号
 * 2、调用accept方法接收请求
 * 3、获取输入流,读取客户端发来的数据
 * 4、输出数据
 * 5、回复数据--输出流
 * 6、关闭连接
 * @author Dushine2008
 *
 */
public class TcpServer {

	public static void main(String[] args) throws IOException {
		// 1、创建ServerSocket,明确服务端端口号
		ServerSocket serverSocket = new ServerSocket(5678);
		
		// 2、调用accept方法接收请求
		Socket socket = serverSocket.accept();
		
		// 3、获取输入流,读取客户端发来的数据
		InputStream is = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
		
		// 4、输出数据
		String msg = reader.readLine();
		System.out.println(socket.getInetAddress().getHostAddress() + "发来消息:" + msg);
		
		// 6、关闭连接
		serverSocket.close();
	}

}
