package com.wang.test;

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
		ServerSocket server = new ServerSocket(2016);
		
		System.out.println("客户端连接成功……");
		Socket s = server.accept();
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		System.out.println("   猜拳游戏");
		System.out.println("==============");
		System.out.println("    1.石头");
		System.out.println("    2.剪刀");
		System.out.println("    3.布");
		System.out.println("==============");
		System.out.print("请出拳：");
		int r1 = sc.nextInt();
		os.write(r1);
		System.out.println("等待对方出拳：");
		int r2 = is.read();
		
		System.out.println("我出拳："+MyUtil.qStr(r1)+"\n对方出拳："+MyUtil.qStr(r2));
		int reslut = MyUtil.bijiao(r1, r2);
		if(reslut==0){
			System.out.println("【平局】");
		}
		if(reslut==1){
			System.out.println("【FWQ赢了】");
		}
		if(reslut==2){
			System.out.println("【FWQ输了】");
		}
		
		is.close();
		os.close();
		s.close();
		System.out.println("运行结束");	
	}

}
