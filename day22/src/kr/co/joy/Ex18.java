package kr.co.joy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex18 extends Frame {
	
	public Ex18() {
		Font font=new Font(Font.SERIF,Font.BOLD,30);
		BorderLayout bl=new BorderLayout();
		GridBagLayout gbl=new GridBagLayout();
		Panel p1=new Panel();
		p1.setLayout(bl);
		TextField tf=new TextField();
		tf.setFont(font);
		p1.add(BorderLayout.NORTH,tf);
		Panel center=new Panel();
		center.setLayout(gbl);
		GridBagConstraints bgc=new GridBagConstraints();
		bgc.fill=GridBagConstraints.BOTH;
		bgc.weightx=1.0;
		bgc.weighty=1.0;
		
		setBtn(center,bgc,"7",0,0,1,1);
		setBtn(center,bgc,"8",1,0,1,1);
		setBtn(center,bgc,"9",2,0,1,1);
		setBtn(center,bgc,"-",3,0,1,1);
		setBtn(center,bgc,"4",0,1,1,1);
		setBtn(center,bgc,"5",1,1,1,1);
		setBtn(center,bgc,"6",2,1,1,1);
		setBtn(center,bgc,"+",3,1,1,1);
		setBtn(center,bgc,"1",0,2,1,1);
		setBtn(center,bgc,"2",1,2,1,1);
		setBtn(center,bgc,"3",2,2,1,1);
		setBtn(center,bgc,"=",3,2,1,2);
		setBtn(center,bgc,"0",0,3,2,1);
		setBtn(center,bgc,".",2,3,1,1);
		
		p1.add(BorderLayout.CENTER,center);
		add(p1);
		setLocation(400,100);
		setSize(300,400);
		setVisible(true);
	}
	
	public void setBtn(Panel center,GridBagConstraints bgc,String msg
						,int x, int y, int w, int h){
		bgc.gridx=x;
		bgc.gridy=y;
		bgc.gridwidth=w;
		bgc.gridheight=h;
		Button btn=new Button(msg);
		center.add(btn,bgc);
	}

	public static void main(String[] args) {
		Ex18 me =new Ex18();

	}

}
