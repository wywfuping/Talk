package com.yawei.test;

public class Person extends Thread {
	
	public void feed(Dog d){
		System.out.println("ι������");
		this.watchTV();
		d.eat(new Event(){
			@Override
			public void doSomething() {
				runDog();
			}
		});
	}
	
	public void watchTV(){
		System.out.println("�����ӡ���");
	}
	
	public void runDog(){
		System.out.println("�޹�����");
	}
	
	public void playDog(){
		System.out.println("�͹���ˣ����");
	}
	
}
