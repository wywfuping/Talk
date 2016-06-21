package com.yawei.wm;

public class Hotel {
	
	public void cook(Event ev){
		System.out.println("开始做饭……");
		Thread th = new Thread();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("饭已做好……准备送餐……");
		ev.doSomething();
	}
	
	public void service(){
		System.out.println("送餐结束……");
	}
	
}
