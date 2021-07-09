package kr.co.joy;

public class Ex07 {

	public static void main(String[] args) {
		// 배열의 깊은 복사
		int[] arr1={1,2,3,4};
		// 1.
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr1[i];
		}
		arr2[2]=22222;
		// 2.
		int[] arr3={9,9,9,9,9,9};
		System.arraycopy(arr1, 0, arr3, 1, 4);
		arr1[2]=33333;
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}

	}

}
