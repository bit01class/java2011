package kr.co.arr01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex09 extends Frame{
	
	public Ex09() {
		GridLayout gl=new GridLayout(4,6);
		setLayout(gl);
		
		Button[] btns=new Button[4*6];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button();
		}
		
		for(int i=0; i<btns.length; i++){
			add(btns[i]);
		}
		
		setBounds(400,50,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09 me = new Ex09();

	}

}
