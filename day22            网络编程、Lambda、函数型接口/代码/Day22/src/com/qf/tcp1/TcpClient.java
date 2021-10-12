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
 * 1、创建Socket对象
 * 2、创建输入流--准备文件信息
 * 3、获取输出流--输出文件信息
 * 4、文件信息和文件数据合并发送
 * 5、读写数据
 * 6、关闭连接
 * @author Dushine2008
 *
 */
public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1、创建Socket对象
		Socket socket = new Socket("10.31.154.53", 6677);
		
		// 2、创建输入流--准备文件信息
		File file = new File("D:/threeCountry.txt");
		FileInputStream fis = new FileInputStream(file);
		
		// 3、获取输出流--输出文件信息
		OutputStream os = socket.getOutputStream();
		
		// 获取文件名字的字节数组
		byte[] bs = file.getName().getBytes();
		
		// 确定每一个数组的长度都是256
		byte[] bytes = Arrays.copyOf(bs, 256);
		
		// 4、文件信息和文件数据合并发送
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		SequenceInputStream sis = new SequenceInputStream(bais, fis);
		
		// 5、读写数据
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = sis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println("文件上传成功...");
		fis.close();
		socket.close();
	}
}
