package kr.co.joy;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex11 extends Frame implements KeyListener{
	Label la;
	int limitX,limitY;
	public Ex11() {
		Panel p=new Panel();
		p.setLayout(null);
		
		la=new Label("@");
		la.setBackground(Color.RED);
		la.setSize(25,25);
		la.setLocation(200, 200);
		addKeyListener(this);
		p.add(la);
		add(p);
		setLocation(400,50);
		setSize(300,500);
		setVisible(true);
		limitX=p.getWidth();
		limitY=p.getHeight();
	}
	
	public static void main(String[] args) {
		Ex11 me=new Ex11();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Point loc = la.getLocation();
		int x=loc.x;
		int y=loc.y;
		if(e.getKeyCode()==37){
			if(x-10<0){x=10;}
			la.setLocation(x-10, y);
		}else if(e.getKeyCode()==39){
			System.out.println(limitX);
			if(x>limitX-35){x=limitX-35;}
			la.setLocation(x+10,y);
		}else if(e.getKeyCode()==38){
			if(y-10<0){y=10;}
			la.setLocation(x,y-10);
		}else if(e.getKeyCode()==40){
			if(y>limitY-35){y=limitY-35;}
			la.setLocation(x,y+10);
		}
		
	}

}
