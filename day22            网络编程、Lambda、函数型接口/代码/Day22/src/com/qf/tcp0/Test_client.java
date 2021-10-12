package com.qf.tcp0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test_client {
public static void main(String[] args) throws UnknownHostException, IOException {
	System.out.println(InetAddress.getLocalHost());
	Socket socket = new Socket("10.31.154.18",6666);
	OutputStream os= socket.getOutputStream();
	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入信息");
	String msg = sc.nextLine();
	
	bw.write(msg);
	bw.flush();
	
	socket.close();
	System.out.println("信息发送完毕");
}
}
