package kr.co.joy;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Ex05 extends Frame implements WindowStateListener{

	public Ex05() {
		addWindowStateListener(this);
		setBounds(400,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex05 me=new Ex05();

	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("¿Ã∫•∆Æ");
	}

}
