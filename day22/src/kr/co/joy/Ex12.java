package kr.co.joy;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex12 extends Frame{
	
	public Ex12() {
//		FlowLayout layout=new FlowLayout();
		GridLayout layout=new GridLayout(3,2);
		
		Panel p = new Panel();
		p.setLayout(layout);
		
		Button btn1=new Button("��ư1");
		Button btn2=new Button("��ư2");
		Button btn3=new Button("��ư3");
		Button btn4=new Button("��ư4");
		Button btn5=new Button("��ư5");
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex12 me = new Ex12();

	}

}
