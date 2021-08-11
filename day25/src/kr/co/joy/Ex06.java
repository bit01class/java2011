package kr.co.joy;

import java.awt.Frame;
import java.awt.Label;
import java.util.Scanner;

public class Ex06 extends Thread{
	boolean boo=true;
	@Override
	public void run() {
		Frame f=new Frame();
		Label la=new Label();
		f.add(la);
		f.setBounds(400,100,300,300);
		f.setVisible(true);
		int su=0;
		while(true){
			if(boo){
			la.setText(""+su++);
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1.½ÃÀÛ 2.Á¾·á 3.¸ØÃã 4.Àç½ÃÀÛ 0.³¡>");
			int input=sc.nextInt();
			if(input==1){
				me.start();
			}else if(input==2){
				me.stop();
			}else if(input==3){
				me.suspend();
//				me.boo=false;
			}else if(input==4){
				me.resume();
//				me.boo=true;
			}else if(input==0){break;}
		}
	}

}
