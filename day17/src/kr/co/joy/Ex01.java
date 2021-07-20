package kr.co.joy;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램(ver 0.6.0)
		// 1.보기 2.입력 0.종료>2
		// 성적>90
		// 1.보기 2.입력 0.종료>2
		// 성적>80
		// 1.보기 2.입력 0.종료>1
		// 1번 : 90
		// 2번 : 80
		System.out.println("학생성적관리 프로그램(ver 0.6.0)");
		Scanner sc=new Scanner(System.in);
		int[] data=new int[0];
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			int input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				for(int i=0; i<data.length; i++){
					System.out.println(i+1+"번 "+data[i]);
				}
			}
			if(input==2){
				System.out.print("성적 >>");
				input=sc.nextInt();
				int[] temp=new int[data.length+1];
				for(int i=0; i<data.length; i++){
					temp[i]=data[i];
				}
				temp[temp.length-1]=input;
				data=temp;
			}
		}
	}

}








