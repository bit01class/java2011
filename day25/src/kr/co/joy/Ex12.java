package kr.co.joy;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex12 extends Frame{

	public Ex12() {
		Panel p=new Panel();
		
		Button btn=new Button("btn");
		Panel p1=new Panel();
		p1.setBackground(Color.RED);
		Label la1=new Label("첫번째 Panel");
		p1.add(la1);
		p1.add(btn);
		Panel p2=new Panel();
		p2.setBackground(Color.BLUE);
		Label la2=new Label("두번째 Panel");
		p2.add(la2);
		p2.add(btn);
		
		p.add(p1);
		p.add(p2);
		add(p);
		setBounds(400,100,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex12 me = new Ex12();

	}

}
