package kr.co.joy;

import java.awt.Frame;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex13 extends Frame{
	JLabel la;
	public Ex13() {
		la=new JLabel();
		la.setText("¶óº§");
		
		setImage("game2.png");
		add(la);
		setBounds(400,100,400,400);
		setVisible(true);
	}
	
	public void setImage(String msg){
		File file=new File(msg);
		InputStream is=null;
		ByteArrayOutputStream baos=null;
		try {
			is=new FileInputStream(file);
			baos=new ByteArrayOutputStream();
			while(true){
				int su=is.read();
				if(su==-1){break;}
				baos.write(su);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Icon icon=new ImageIcon(baos.toByteArray());
		la.setIcon(icon);
	}

	public static void main(String[] args) throws InterruptedException {
		Ex13 me = new Ex13();
		
		while(true){
			Thread.sleep(1000);
			me.setImage("game1.png");

			Thread.sleep(1000);
			me.setImage("game2.png");
		}
	}

}
