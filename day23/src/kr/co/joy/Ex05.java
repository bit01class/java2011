package kr.co.joy;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 implements WindowListener{
	static Frame f; 

	public static void main(String[] args) {
		f=new Frame();
		Ex05 me=new Ex05();
		f.addWindowListener(me);
		f.setLocation(400,100);
		f.setSize(400,300);
		f.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 열렸을때");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("닫기 버튼을 누를때");
//		System.exit(0);
		f.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("종료될 때");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창 최소화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창 최소화에서 복귀");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창 활성화");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창 비활성화");
	}

}
