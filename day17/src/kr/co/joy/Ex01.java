package kr.co.joy;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �л��������� ���α׷�(ver 0.6.0)
		// 1.���� 2.�Է� 0.����>2
		// ����>90
		// 1.���� 2.�Է� 0.����>2
		// ����>80
		// 1.���� 2.�Է� 0.����>1
		// 1�� : 90
		// 2�� : 80
		System.out.println("�л��������� ���α׷�(ver 0.6.0)");
		Scanner sc=new Scanner(System.in);
		int[] data=new int[0];
		while(true){
			System.out.print("1.���� 2.�Է� 0.����>");
			int input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				for(int i=0; i<data.length; i++){
					System.out.println(i+1+"�� "+data[i]);
				}
			}
			if(input==2){
				System.out.print("���� >>");
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








