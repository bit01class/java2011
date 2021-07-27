package kr.co.joy;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex15 {

	public static void main(String[] args) {
		CardLayout layout=new CardLayout();
		Frame f=new Frame();
		f.setLayout(layout);
		
		Panel p1=new Panel();
		Label la1=new Label("첫번째");
		p1.add(la1);
		Panel p2=new Panel();
		Label la2=new Label("두번째");
		p2.add(la2);
		Panel p3=new Panel();
		Label la3=new Label("세번째");
		p3.add(la3);
		Panel p4=new Panel();
		Label la4=new Label("네번째");
		p4.add(la4);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.setLocation(400,100);
		f.setSize(300,500);
		f.setVisible(true);
		layout.next(f);
		layout.next(f);
		layout.next(f);
		layout.next(f);
	}

}
