package kr.co.joy;

public class Ex06 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abcdefg");
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("------------------");
		String st1="ABCDEFG";
		char[] arr=new char[st1.length()];
		for(int i=0; i<arr.length; i++){
			arr[i]=st1.charAt(st1.length()-1-i);
		}
		String st2=new String(arr);
		System.out.println(st2);
	}

}
