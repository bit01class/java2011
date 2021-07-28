package kr.co.joy;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

class Ex33 extends Canvas{
	//ctrl+space
	
	public void paint(Graphics g) {
		Color c=new Color(255,0,0);
		g.setColor(c);
		g.drawLine(100, 100, 200, 200);
		g.drawRect(200, 100, 50, 50);
		g.drawOval(100, 300, 50, 50);
		g.drawArc(300, 300, 50, 50, 45, 180);
		g.drawPolygon(new int[]{400,300,500}, new int[]{100,200,200}, 3);
		
//		g.fillRect(200, 100, 50, 50);
//		g.fillOval(100, 300, 50, 50);
//		g.fillArc(300, 300, 50, 50, 45, 180);
//		g.fillPolygon(new int[]{400,300,500}, new int[]{100,200,200}, 3);
		
//		g.draw3DRect(200, 100, 50, 50,true);
		
		g.drawChars(new char[]{'A','B','C','D'}, 0, 4, 100, 100);
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img01.jpg");
		g.drawImage(img, 200, 200,100,100, this);
	}
}

public class Ex03 extends Frame{
	
	public Ex03() {
		Canvas can=new Ex33();
		add(can);
		setLocation(400,100);
		setSize(500,500);
		setVisible(true);
//		paint();
//		repaint();
//		validate();
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();

	}

}
