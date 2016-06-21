package com.yawei.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(2017);
		
		System.out.println("客户端连接成功，开始聊天……");
		Socket s = server.accept();
		
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		PrintWriter pw =new PrintWriter(os,true);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		while(true){
			System.out.print("请输入：");
			String msg = sc.next();
			pw.println("服务器：" + msg);
			do{
				msg = br.readLine();
			}while(msg==null);
			System.out.println("你 ："+ msg);
		}
	}

}
