package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		// 문자열 -> 기본자료형
		String msg1="가";
		byte[] arr1=msg1.getBytes();
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		String msg2=new String(arr1);
		System.out.println(msg2);
		System.out.println("----------------------");
		char[] arr2=msg1.toCharArray();
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]+":"+(int)arr2[i]);
		}
	}

}
