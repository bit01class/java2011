package kr.co.joy;
interface Inter12{}
class Ex11111 implements Inter12{}
class Ex22222 implements Inter12{}


public class Ex12 {

	public static void main(String[] args) {
		Inter12 in12=new Ex11111();
		in12=new Ex22222();
	}

}
