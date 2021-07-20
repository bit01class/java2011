package kr.co.joy;

import java.util.Scanner;

abstract class Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public abstract void work();
}

class Tv extends Machine{
	public void work(){
		System.out.println("����� �����ִ�");
	}
}

class Radio extends Machine{
	public void work(){
		System.out.println("��� �Ҹ��� ����ִ�");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("������ ����ִ�");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Machine remote=null;
		while(true){
			System.out.print("1.Tv 2.radio 3.audio 0.���� >");
			int input=sc.nextInt();
			String info=null;
			if(input==0){break;}
			if(input==1){
				info="kr.co.joy.Tv";
			}else if(input==2){
				info="kr.co.joy.Radio";
			}else if(input==3){
				info="kr.co.joy.Audio";
			}else if(input==4){
				info="com.samsung.Air";
			}
			try {
				Class clzz = Class.forName(info);
				remote=(Machine) clzz.newInstance();
				remote.on();
				remote.work();
				remote.off();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

}








