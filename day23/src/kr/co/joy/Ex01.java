package kr.co.joy;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex01 extends Frame{
	
	public Ex01() {
		Button btn=new Button("버튼");
		
		FileDialog dia=new FileDialog(this,"창제목",1);
		dia.setLocation(600,200);
		dia.setSize(300,200);
		dia.setVisible(true);
		System.out.println(dia.getDirectory()+","+dia.getFile());
		
		setLocation(400,100);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}

}
