package kr.co.joy;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class Ex04 {

	public static void main(String[] args) {
		Frame frame=new Frame();
		Panel p=new Panel();		
		java.awt.Font font=new Font(Font.SERIF,Font.PLAIN,30);
		Color color=new Color(255,0,0);
		
		Button btn1=new Button();
		btn1.setLabel("버튼1abcd");
		btn1.setForeground(color);
		p.add(btn1);
		
		
		Button btn2=new Button("버튼2abcd");
		btn2.setFont(font);
		btn2.setBackground(color);
		p.add(btn2);
		
		
		frame.add(p);
		frame.setLocation(400,100);
		frame.setSize(400,300);
		frame.setVisible(true);
	}

}










