package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex10 extends Frame implements KeyListener{
	TextField tf;
	public Ex10() {
		Panel p=new Panel();
		Button btn=new Button("@");
//		p.add(btn);
		tf=new TextField(10);
		addKeyListener(this);
//		p.add(tf);
		
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex10 me = new Ex10();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped"+e.getKeyChar()+":"+tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyDOWN"+e.getKeyCode()+":"+tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyUP"+e.getKeyChar()+":"+tf.getText());
	}

}
