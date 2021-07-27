package kr.co.joy;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Ex08 {

	public static void main(String[] args) {
		Frame f=new Frame();
		Panel p=new Panel();
		
		Choice cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		
		cho.select("item2");
		
		p.add(cho);
		
		f.add(p);
		f.setLocation(400,100);
		f.setSize(400,100);
		f.setVisible(true);
	}

}
