package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame implements MouseListener {
	
	public Ex07() {
		Panel p=new Panel();
		Button btn=new Button("버튼");
//		btn.addMouseListener(this);
		p.addMouseListener(this);
		p.add(btn);
		add(p);
		setLocation(400,100);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me = new Ex07();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getSource());
		System.out.println(e.getX()+","+e.getY());
		System.out.println(e.getXOnScreen()+","+e.getYOnScreen());
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("마우스 버튼 down");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("마우스 버튼 up");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("마우스 over");
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("마우스 out");
	}

}
