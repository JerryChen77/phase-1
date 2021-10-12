package com.qf.tcp02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1、创建ServerSocket对象
 * 2、调用accept方法获取Socket对象
 * 3、获取输入流
 * 4、创建输出流--把读取的文件数据写到本地
 * 5、循环读写
 * 6、关闭连接
 * @author Dushine2008
 *
 */
public class TcpServer {
	public static void main(String[] args) throws IOException {
		// 1、创建ServerSocket对象
		ServerSocket serverSocket = new ServerSocket(6789);
		
		// 2、调用accept方法获取Socket对象
		Socket socket = serverSocket.accept();
		
		// 3、获取输入流
		InputStream is = socket.getInputStream();
		
		// 4、创建输出流--把读取的文件数据写到本地
		FileOutputStream fos = new FileOutputStream(new File("img001.jpg"));
		
		//  5、循环读写
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len=is.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		// 6、关闭连接
		System.out.println("文件接收完成...");
		fos.close();
		serverSocket.close();
		
	}
}
