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
		
		System.out.println("�ͻ������ӳɹ�����");
		Socket s = server.accept();
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
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
			System.out.println("��FWQӮ�ˡ�");
		}
		if(reslut==2){
			System.out.println("��FWQ���ˡ�");
		}
		
		is.close();
		os.close();
		s.close();
		System.out.println("���н���");	
	}

}
