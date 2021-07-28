package kr.co.joy;

import javax.swing.JFrame;

public class Ex06 extends JFrame {
	
	public Ex06() {
//		0=JFrame.ABORT;
//		1=JFrame.HIDE_ON_CLOSE;
//		2=JFrame.DISPOSE_ON_CLOSE;
//		3=JFrame.EXIT_ON_CLOSE;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex06 me = new Ex06();

	}

}
