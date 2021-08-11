package kr.co.joy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex14 extends Frame implements ActionListener{
	Panel p;
	Button btn, first, next,nextnext;
	int cnt;
	@Override
	public void actionPerformed(ActionEvent e) {
			p.add(first);
			btn=first;
			first=next;
			next=nextnext;
			nextnext=btn;
		validate();
	}
	public Ex14() {
		BorderLayout layout=new BorderLayout();
		setLayout(layout);
		
		p=new Panel();
		Button btn=new Button("시작");
		btn.addActionListener(this);
		
		Button btn1=new Button("첫번째");
		Button btn2=new Button("두번째");
		Button btn3=new Button("세번째");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				System.out.println(cnt);
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cnt);
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cnt);
			}
		});
		first=btn1;
		next=btn2;
		nextnext=btn3;
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		add(BorderLayout.CENTER,p);
		add(BorderLayout.EAST,btn);
		
		setBounds(400,100,500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex14 me = new Ex14();

	}


}
