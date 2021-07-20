package kr.co.joy;

public class Ex02 {

	public static void main(String[] args) {
		// 자바 리플렉션
//		Ex01 ex01=new Ex01();
//		ex01.func02();
		
		String info="kr.co.joy.Ex01";
		try {
			Class clzz=Class.forName(info);
			Ex01 ex01=(Ex01) clzz.newInstance();
			ex01.func02();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}











