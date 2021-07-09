package kr.co.joy;

public class Ex03 {

	public static void main(String[] args) {
		String st1="Java|DB|Web|Framework";
		String[] arr1=st1.split("\\|");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}

}
