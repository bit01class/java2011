package kr.co.joy;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex07 extends Frame {
	
	public Ex07() {
		Panel p=new Panel();
		
		TextArea ta=new TextArea("기본값",4,10,TextArea.SCROLLBARS_NONE);
//		ta.setText("내용작성");
		p.add(ta);
		
		add(p);
		setLocation(400,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me=new Ex07();
	}

}
