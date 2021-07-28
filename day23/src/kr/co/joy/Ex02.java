package kr.co.joy;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex02 extends Frame{

	public Ex02() {
		MenuBar bar=new MenuBar();
		Menu mn1=new Menu();
		mn1.setLabel("메뉴1");
		bar.add(mn1);
		Menu mn2=new Menu("메뉴2");
		MenuItem mi1=new MenuItem();
		mi1.setLabel("하위1");
		mn2.add(mi1);
		MenuItem mi2=new MenuItem("하위2");
		mn2.add(mi2);
		mn2.addSeparator();
		CheckboxMenuItem cbmi1=new CheckboxMenuItem();
		cbmi1.setLabel("체크1");
		mn2.add(cbmi1);
		Menu mn3=new Menu("하위들");
		MenuItem mi3=new MenuItem("하위에하위1");
		mn3.add(mi3);
		mn2.add(mn3);
		
		bar.add(mn2);
		
		
		this.setMenuBar(bar);
		
		setLocation(400,100);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02();

	}

}
