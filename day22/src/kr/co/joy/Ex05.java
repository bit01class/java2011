package kr.co.joy;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex05 extends Frame {
	
	public Ex05() {
		Color color=new Color(255,0,0);
		Panel p=new Panel();
		
		Label la1=new Label();
		la1.setText("아이디");
		la1.setAlignment(Label.CENTER);
		la1.setBackground(color);
		p.add(la1);
		
		TextField tf1=new TextField(10);
		tf1.setText("");
		p.add(tf1);
		
		Label la2=new Label("비밀번호",Label.CENTER);
		p.add(la2);
		
		TextField tf2=new TextField(10);
		tf2.setEchoChar('#');
		p.add(tf2);
		
		
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex05 me=new Ex05();

	}

}
