package kr.co.joy;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex09 extends Frame{

	public Ex09() {
		super("list");
		Panel p=new Panel();
		
		java.awt.List list=new List(3,true);
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3",0);
		list.addItem("item4");
		list.addItem("item5");
		
		p.add(list);
		
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex09 me=new Ex09();

	}

}
