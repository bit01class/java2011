package kr.co.joy;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex11 extends Frame{
	
	public Ex11() {
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension scr = kit.getScreenSize();
		Image img = kit.getImage("img07.jpg");
		this.setIconImage(img);
		
		JButton btn=new JButton("test");
		ImageIcon icon=new ImageIcon(img);
		btn.setIcon(icon);
		add(btn);
		
		Dimension fsize = new Dimension(400,300);
		setLocation(scr.width/2-fsize.width/2,scr.height/2-fsize.height/2);
		setSize(fsize);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex11 me=new Ex11();
	}

}
