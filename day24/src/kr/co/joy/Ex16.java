package kr.co.joy;

import java.awt.Frame;
import java.awt.Label;
import java.util.Date;

public class Ex16 extends Frame{
	Label la;
	
	public Ex16() {
		la=new Label();
		add(la);
		setBounds(400,100,500,80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex16 me=new Ex16();
		while(true){
			Date d=new java.util.Date();
			String msg=d.toString();
			me.la.setText(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
