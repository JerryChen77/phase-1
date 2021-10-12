package com.qf.tcp1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		// 1、创建ServerSocket对象
		ServerSocket serverSocket = new ServerSocket(6677);
		
		// 2、调用accept方法获取Socket对象
		Socket socket = serverSocket.accept();
		
		// 3、获取输入流
		InputStream is = socket.getInputStream();
		
		// 4、读取文件名字
		byte[] bytes = new byte[256];
		is.read(bytes);
		
		// bytes转换成字符串
		String fileName = new String(bytes);
		fileName = "C:\\Users\\Dushine2008\\Desktop\\" + fileName.trim();
		
		// 创建文件对象
		File file = new File(fileName);
		
		// 5、创建输出流
		FileOutputStream fos = new FileOutputStream(file);
		
		// 6、循环读写
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = is.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		System.out.println("文件接收成功....................");
		
		fos.close();
		serverSocket.close();
	}
}
