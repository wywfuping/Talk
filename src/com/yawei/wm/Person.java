package com.yawei.wm;

public class Person extends Thread {
	
	public void callHotel(final Hotel hotel){
		System.out.println("叫外卖……");
		this.bianCheng();
		hotel.cook(new Event() {
			
			@Override
			public void doSomething() {	
				hotel.service();
			}
		});
	}
	
	public void bianCheng(){
		System.out.println("叫完外卖，接着编程……");
	}
	
	public void eat(){
		System.out.println("开始吃饭……");
	}
	
	
	
}
