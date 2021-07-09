package kr.co.joy;

public class Ex04 {

	public static void main(String[] args) {
		// String의 생성자
		String msg1=new String();
		String msg2=new String("ABCD");
		char[] arr1=new char[]{'A','B','C','D'};
		String msg3=new String(arr1);
		System.out.println(msg3);
		byte[] arr2=new byte[]{65,66,67,68};
		String msg4=new String(arr2);
		System.out.println(msg4);
	}

}
