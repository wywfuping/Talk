package com.yawei.wm;

public class Person extends Thread {
	
	public void callHotel(final Hotel hotel){
		System.out.println("����������");
		this.bianCheng();
		hotel.cook(new Event() {
			
			@Override
			public void doSomething() {	
				hotel.service();
			}
		});
	}
	
	public void bianCheng(){
		System.out.println("�������������ű�̡���");
	}
	
	public void eat(){
		System.out.println("��ʼ�Է�����");
	}
	
	
	
}
