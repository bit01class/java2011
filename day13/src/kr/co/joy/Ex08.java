package kr.co.joy;

class MyErr01 extends Exception{
	
	public MyErr01() {
		super("������ 0~ 100 ���̰��� ������");
	}
	
}

public class Ex08 {
	
	public static void func01() throws MyErr01{
		System.out.println("�����߻���");
		MyErr01 err=new MyErr01();
		if(101>100){throw err;}
		System.out.println("�����߻���");
	}

	public static void main(String[] args){
		try {
			func01();
		} catch (MyErr01 e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
