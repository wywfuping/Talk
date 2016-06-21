package com.yawei.test;

public class Person extends Thread {
	
	public void feed(Dog d){
		System.out.println("Œππ∑°≠°≠");
		this.watchTV();
		d.eat(new Event(){
			@Override
			public void doSomething() {
				runDog();
			}
		});
	}
	
	public void watchTV(){
		System.out.println("ø¥µÁ ”°≠°≠");
	}
	
	public void runDog(){
		System.out.println("Âﬁπ∑°≠°≠");
	}
	
	public void playDog(){
		System.out.println("∫Õπ∑ÕÊÀ£°≠°≠");
	}
	
}
