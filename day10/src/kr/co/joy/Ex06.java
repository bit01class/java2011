package kr.co.joy;

public class Ex06 {

	public static void main(String[] args) {
		int su1=1234;
		int su2=su1;
		su2=4321;
		System.out.println(su1);
		
		int[] arr1={1,2,3,4};
		// 배열의 얕은복사
		int[] arr2=arr1;
		arr2[2]=3333;
		func(arr1);
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
	
	public static void func(int[] arr){
		arr[1]=22222;
	}

}






