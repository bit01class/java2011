package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ex04 extends Frame implements FocusListener{
	TextField tf;
	public Ex04() {
		Panel p=new Panel();
		
		tf=new TextField(10);
		p.add(tf);
		Button btn=new Button("버튼");
		tf.addFocusListener(this);
		p.add(btn);
		add(p);
		setBounds(400,100,400,300);
		setVisible(true);
//		tf.setFocusable(false);
		tf.nextFocus();
		tf.setText("아이디 입력");
	}

	public static void main(String[] args) {
		Ex04 me=new Ex04();

	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포커스를 얻음");
		String msg=tf.getText();
		tf.select(0, msg.length());
//		tf.setText(" ");
//		tf.setText("");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("포커스를 잃음");
		
	}

}
