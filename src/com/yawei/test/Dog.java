package com.yawei.test;

public class Dog  {
	
	public void eat(Event ev){
		System.out.println("���Է�����");
		Thread th = new Thread();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Է���������");
		ev.doSomething();
	}

}
