package kr.co.joy;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame {
	// ��ġ������
	// ������Ʈ�� ��ġ(ũ��,��ġ)�� ������
	
	public Ex03() {
		
		java.awt.Panel p1=new Panel();
		java.awt.FlowLayout layout=new FlowLayout();
		p1.setLayout(layout);
		
		java.awt.Button btn1=new Button();
		Button btn2=new Button();
		Button btn3=new Button();
		Button btn4=new Button();
		Button btn5=new Button();
		
		btn1.setLabel("         ��ư1         ");
		btn2.setLabel("         ��ư2         ");
		btn3.setLabel("         ��ư3         ");
		btn4.setLabel("         ��ư4         ");
		btn5.setLabel("         ��ư5         ");
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
//		p1.add(btn5);
		
		
		add(p1);
		
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();

	}

}
