package kr.co.arr01;

public class Ex04 {
	public static void func(int[] arr){

		arr[1]=2;
		System.out.println(java.util.Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr1=new int[]{1,3,5,7};
		int[] arr2=new int[]{1,3,5,7};
		int[] arr3=arr1;
		System.out.println(arr1==arr2);
		System.out.println(arr1==arr3);
		func(arr1);
//		arr3[1]=2;
		System.out.println(java.util.Arrays.toString(arr1));
	}

}
