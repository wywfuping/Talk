package com.wang.test;

public class MyUtil {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 0:ƽ�� 1��a��ʤ 2��b��ʤ
	 */
	public static int bijiao(int a,int b){
		if(a==b){
			return 0;
		}
		if(a==1&&b==2||a==2&&b==3||a==3&&b==1){
			return 1;
		}else {
			return 2;
		}
	}
	
	public static String qStr(int n){
		return n==1?"ʯͷ":n==2?"����":"��";
	}
}
