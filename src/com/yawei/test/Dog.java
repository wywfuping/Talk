package com.yawei.test;

public class Dog  {
	
	public void eat(Event ev){
		System.out.println("¹·³Ô·¹¡­¡­");
		Thread th = new Thread();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("³Ô·¹½áÊø¡­¡­");
		ev.doSomething();
	}

}
