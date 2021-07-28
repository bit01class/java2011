package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex08 extends Frame implements MouseListener{
	Label la;
	public Ex08() {
		Panel p=new Panel();
		p.addMouseListener(this);
		p.setLayout(null);
		la=new Label("*");
		la.addMouseListener(this);
		la.setLocation(0,0);
		la.setSize(25,25);
		p.add(la);
		add(p);
		setLocation(400,100);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex08 me =new Ex08();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();
//		la.setLocation(x,y);
		System.out.println(e.getSource());
		System.out.println(e.getID());
		if(e.getSource()==la){
			System.out.println("라벨입니다");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();
//		la.setLocation(x,y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
