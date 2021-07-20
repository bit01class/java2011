package kr.co.joy;

import java.util.Arrays;

public class Ex11 {
	int su;
	
	public Ex11(int su) {
		this.su=su;
	}

	public static void main(String[] args) {
		// Arrays
		int[] arr1={1,5,8,3,6};
//		for(int i=0; i<arr1.length; i++){
//			System.out.println(">>>"+arr1[i]);
//		}
		arr1[2]=9;
		System.out.println(arr1);
		System.out.println(java.util.Arrays.toString(arr1));
		String[] arr2={"a","aa","aaa"};
		System.out.println(Arrays.toString(arr2));
		Ex11[] arr3=new Ex11[3];
		arr3[0]=new Ex11(111);
		arr3[1]=new Ex11(222);
		arr3[2]=new Ex11(333);
		System.out.println(Arrays.toString(arr3));
	}
	
//	public String toString(){
//		return this.su+"";
//	}
}









