package kr.co.joy;

interface CopyObject{}
public class Ex13 implements Cloneable, CopyObject{

	public static void main(String[] args) throws CloneNotSupportedException {
		Ex13 me=new Ex13();
		Object obj=me.clone();
		System.out.println(obj);
	}

}
