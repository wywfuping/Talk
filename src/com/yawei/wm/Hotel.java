package com.yawei.wm;

public class Hotel {
	
	public void cook(Event ev){
		System.out.println("��ʼ��������");
		Thread th = new Thread();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�������á���׼���Ͳ͡���");
		ev.doSomething();
	}
	
	public void service(){
		System.out.println("�Ͳͽ�������");
	}
	
}
