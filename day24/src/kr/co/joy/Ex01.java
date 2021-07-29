package kr.co.joy;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex01 extends Frame implements ItemListener{
	
	public Ex01() {
		Panel p=new Panel();
		
		Choice cho=new Choice();
		cho.addItem("choice01");
		cho.addItem("choice02");
		cho.addItem("choice03");
		cho.addItem("choice04");
		cho.addItemListener(this);
		p.add(cho);
		
		List list=new List(4);
		list.addItem("list01");
		list.addItem("list02");
		list.addItem("list03");
		list.addItem("list04");
		list.addItemListener(this);
		p.add(list);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("ch1",false,cbg);
		Checkbox cb2=new Checkbox("ch2",true,cbg);
		Checkbox cb3=new Checkbox("ch3",false,cbg);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		p.add(cb1);p.add(cb2);p.add(cb3);
		
		add(p);
		setBounds(400,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me =new Ex01();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("이벤트 발생"+e.getSource());
		System.out.println(e.getStateChange());
		System.out.println(e.getItem());
	}

}
