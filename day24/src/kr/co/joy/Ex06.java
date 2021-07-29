package kr.co.joy;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex06 extends Frame {
	public Ex06() {
		WindowAdapter clos=new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		};
		addWindowListener(clos);
		setBounds(400,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex06 me =new Ex06();

	}

}
