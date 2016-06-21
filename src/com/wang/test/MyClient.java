package com.wang.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class MyClient {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket client = new Socket("192.168.0.137", 6635);
		
		System.out.println("已连至接服务器……");
		OutputStream os = client.getOutputStream();
		InputStream is = client.getInputStream();

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
			System.out.println("【KHD赢了】");
		}
		if(reslut==2){
			System.out.println("【KHD输了】");
		}
		
		os.close();
		is.close();
		client.close();
		System.out.println("运行结束");
	}

}
