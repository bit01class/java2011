package kr.co.joy;

class MyErr01 extends Exception{
	
	public MyErr01() {
		super("점수는 0~ 100 사이값만 가능함");
	}
	
}

public class Ex08 {
	
	public static void func01() throws MyErr01{
		System.out.println("에러발생전");
		MyErr01 err=new MyErr01();
		if(101>100){throw err;}
		System.out.println("에러발생후");
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
