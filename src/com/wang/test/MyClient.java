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
		
		System.out.println("�������ӷ���������");
		OutputStream os = client.getOutputStream();
		InputStream is = client.getInputStream();

		System.out.println("   ��ȭ��Ϸ");
		System.out.println("==============");
		System.out.println("    1.ʯͷ");
		System.out.println("    2.����");
		System.out.println("    3.��");
		System.out.println("==============");
		System.out.print("���ȭ��");
		int r1 = sc.nextInt();
		os.write(r1);
		System.out.println("�ȴ��Է���ȭ��");
		int r2 = is.read();
		
		System.out.println("�ҳ�ȭ��"+MyUtil.qStr(r1)+"\n�Է���ȭ��"+MyUtil.qStr(r2));
		int reslut = MyUtil.bijiao(r1, r2);
		if(reslut==0){
			System.out.println("��ƽ�֡�");
		}
		if(reslut==1){
			System.out.println("��KHDӮ�ˡ�");
		}
		if(reslut==2){
			System.out.println("��KHD���ˡ�");
		}
		
		os.close();
		is.close();
		client.close();
		System.out.println("���н���");
	}

}
