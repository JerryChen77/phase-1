package com.qf.tcp0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1、创建Socket对象,指明IP和Port
 * 2、获取输出流
 * 3、发送数据
 * 4、接收回复
 * 5、关闭
 * @author Dushine2008
 *
 */
public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1、创建Socket对象,指明IP和Port
		Socket socket = new Socket("10.31.154.53", 5678);
		
		// 2、获取输出流
		OutputStream os = socket.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));
		
		// 3、发送数据
		writer.write("唧唧复唧唧");
		writer.flush();
		// 5、关闭
		socket.close();
	}
}
