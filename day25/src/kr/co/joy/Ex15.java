package kr.co.joy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex15 extends Frame implements Runnable {
	Label la;
	public Ex15() {
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		la=new Label();
		p3.add(la);
		add(BorderLayout.CENTER,p1);
		add(BorderLayout.EAST,p2);
		add(BorderLayout.NORTH,p3);
		
		setBounds(400,100,500,400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		Ex15 me = new Ex15();
		int su=60;
		for(int i=60; i>=0; i--){
			me.la.setText(i+"√ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void run() {
		
	}

}
