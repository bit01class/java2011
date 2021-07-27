package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex17 extends Frame{
	
	public Ex17() {
		Panel p=new Panel();
		p.setLayout(null);
		Button btn=new Button("btn");
		btn.setSize(384,261);
		btn.setLocation(0,0);
		p.add(btn);
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
		System.out.println(p.getWidth()+","+p.getHeight());
	}

	public static void main(String[] args) {
		Ex17 me = new Ex17();

	}

}
