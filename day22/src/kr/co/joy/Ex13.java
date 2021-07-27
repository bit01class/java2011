package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex13 {

	public static void main(String[] args) {
		Frame f=new Frame();
		GridLayout layout=new GridLayout(4,3);
		Panel p=new Panel();
		p.setLayout(layout);
		
		String[] las={"7","8","9","4","5","6","1","2","3","*","0","#"};
		Button[] btns=new Button[las.length];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(las[i]);
			p.add(btns[i]);
		}
		
		f.add(p);
		f.setLocation(400,100);
		f.setSize(300,500);
		f.setVisible(true);

	}

}
