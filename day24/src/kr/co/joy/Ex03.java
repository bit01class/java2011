package kr.co.joy;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends Frame implements ActionListener{
	
	public Ex03() {
		Panel p= new Panel();
		
		TextField tf=new TextField(10);
		tf.addActionListener(this);
		p.add(tf);
		
		Button btn=new Button("버튼");
		btn.addActionListener(this);
		p.add(btn);
		
		List list=new List();
		list.addItem("list1");
		list.addItem("list2");
		list.addItem("list3");
		list.addActionListener(this);
		p.add(list);
		
		
		
		add(p);
		setBounds(400,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me =new Ex03();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트 발생"+e.getSource());
	}

}
