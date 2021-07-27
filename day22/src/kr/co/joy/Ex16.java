package kr.co.joy;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex16 extends Frame {
	
	public Ex16() {
		GridBagLayout layout=new GridBagLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		Button btn0=new Button();
		Button btn1=new Button();
		Button btn2=new Button();
		Button btn3=new Button();
		Button btn4=new Button();
		Button btn5=new Button();
		Button btn6=new Button();
		Button btn7=new Button();
		Button btn8=new Button();
		Button btn9=new Button();
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p.add(btn0,gbc);
		gbc.gridx=1;
//		gbc.gridy=0;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn1,gbc);
		gbc.gridx=2;
//		gbc.gridy=0;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn2,gbc);
		gbc.gridx=3;
//		gbc.gridy=0;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn3,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn4,gbc);
		gbc.gridx=1;
//		gbc.gridy=1;
		gbc.gridwidth=2;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn5,gbc);
		gbc.gridx=3;
//		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=2;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn6,gbc);
		gbc.gridx=0;
		gbc.gridy=2;
//		gbc.gridwidth=1;
		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn7,gbc);
		gbc.gridx=1;
//		gbc.gridy=2;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn8,gbc);
		gbc.gridx=2;
//		gbc.gridy=2;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
		p.add(btn9,gbc);
		
		add(p);
		setLocation(400,100);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex16 me=new Ex16();

	}

}
