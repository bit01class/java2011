package kr.co.class01;

interface Inter{
	public final static int su=1234;
	public abstract void func01();
	public void func02();
	void func03();
}

public class Ex12 extends Object implements Inter{

	public static void main(String[] args) {
		Inter me=new Ex12();
		me.func01();
		System.out.println(Inter.su);
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
