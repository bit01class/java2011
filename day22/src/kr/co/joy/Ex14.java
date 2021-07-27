package kr.co.joy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex14 extends Frame{
	
	public Ex14() {
		BorderLayout layout=new BorderLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		Button btn1=new Button("center");
		Button btn2=new Button("north");
		Button btn3=new Button("south");
		Button btn4=new Button("east");
		Button btn5=new Button("west");
		
		p.add(BorderLayout.CENTER,btn1);
		p.add(BorderLayout.NORTH,btn2);
		p.add(BorderLayout.SOUTH,btn3);
		p.add(BorderLayout.EAST,btn4);
		p.add(BorderLayout.WEST,btn5);
		
		add(p);
		setLocation(400,100);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex14 me=new Ex14();
	}

}
