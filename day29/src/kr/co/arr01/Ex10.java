package kr.co.arr01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

public class Ex10 extends Frame {
	
	public Ex10() {
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);
		
		ArrayList<Button> list=new ArrayList<>();
		for(int i=0; i<4*5; i++){
			list.add(new Button());
		}
		
		for(int i=0; i<list.size(); i++){
			add(list.get(i));
		}
		
		
		setBounds(400,50,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10 me = new Ex10();

	}

}
