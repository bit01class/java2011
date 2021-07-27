package kr.co.joy;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex06 {

	public static void main(String[] args) {
		Frame f=new Frame();
		Panel p=new Panel();
		
		Checkbox box1=new Checkbox();
		Checkbox box2=new Checkbox("",true);
		Checkbox box3=new Checkbox("item3",false);
		
		box1.setState(true);
		box1.setLabel("item1");
		box2.setLabel("item2");
		
		p.add(box1);
		p.add(box2);
		p.add(box3);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox box4=new Checkbox("item1",false,cbg);
		Checkbox box5=new Checkbox("item2",true,cbg);
		Checkbox box6=new Checkbox("item3",false,cbg);
		
		p.add(box4);
		p.add(box5);
		p.add(box6);
		
		f.add(p);
		f.setLocation(400,100);
		f.setSize(400,300);
		f.setVisible(true);
	}

}











