package com.qf.tcp02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1、创建Socket对象
 * 2、创建输入流
 * 3、获取输出流
 * 4、读写数据
 * 5、关闭连接
 * @author Dushine2008
 *
 */
public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1、创建Socket对象
		Socket socket = new Socket("10.31.154.53", 6789);
		
		// 2、创建输入流
		FileInputStream fis = new FileInputStream(new File("D:\\img001.jpg"));
		
		// 3、获取输出流
		OutputStream os = socket.getOutputStream();
		
		// 4、读写数据
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = fis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		
		// 5、关闭连接
		System.out.println("上传完成...");
		fis.close();
		socket.close();
	}
}
