package kr.co.joy;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex02 extends Frame implements TextListener {
	
	public Ex02() {
		Panel p=new Panel();
		
		TextField tf=new TextField(10);
		tf.addTextListener(this);
		p.add(tf);
		add(p);
		setBounds(400,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println("이벤트 발생"+e.getSource());
		TextField tf=(TextField)(e.getSource());
		System.out.println(tf.getText());
	}

}
