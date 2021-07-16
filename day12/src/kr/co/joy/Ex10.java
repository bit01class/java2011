package kr.co.joy;

// 추상메서드만으로 구성
interface Inter01{
	public final static int su1=1111;
	static final int su2=2222;
	final int su3=3333;
	int su4=4444;
	
	public abstract void func01();
	public abstract void func02(int a);
	abstract void func03();
	void func04();
}

interface Inter02{
	void func04();
	void func05();
}

interface Inter03 extends Inter01,Inter02 {}


public class Ex10 extends Object implements Inter01,Inter02{
	public void func01(){}
	public void func02(int a){}
	public void func03(){}
	public void func04(){}
	public void func05(){}

	public static void main(String[] args) {
		System.out.println(kr.co.joy.Inter01.su3);
//		su4=4444;
		System.out.println(su3);

	}

}
