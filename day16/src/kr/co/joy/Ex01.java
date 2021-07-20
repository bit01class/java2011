package kr.co.joy;

import java.util.Scanner;

public class Ex01 {
	
	public static void func02(){
		System.out.println("Ex01 func02 run...");
	}

	public static Number func01(int su1,int su2){
		if(su1%su2==0){return su1/su2;}
		return su1*1.0/su2;
	}
	
	public static void main(String[] args) {
		int su1=5;
		int su2=2;
		System.out.println(func01(su1,su2));
		Number num=new Integer(1234);
		num=new Double(3.14);
		
	}

}
