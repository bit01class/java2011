package kr.co.joy;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex09 extends Frame implements MouseMotionListener {
	Label la;
	public Ex09() {
		Panel p=new Panel();
		p.setLayout(null);
		la=new Label("@");
		this.addMouseMotionListener(this);
		la.setLocation(0, 0);
		la.setSize(25,25);
		p.add(la);
//		add(p);
		setLocation(400,100);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex09 me=new Ex09();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("드레그:"+e.getX()+","+e.getY());
		la.setLocation(e.getX(), e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("무브:"+e.getX()+","+e.getY());
	}

}
