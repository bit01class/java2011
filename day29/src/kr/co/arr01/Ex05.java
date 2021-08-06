package kr.co.arr01;

public class Ex05 {

	public static void main(String[] args) {
		int[] arr1={1,3,5,8,9};
		System.out.println("1.--------------------------");
		int[] arr2=new int[5];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr1[i];
		}
		System.out.println(arr1==arr2);
		System.out.println(java.util.Arrays.toString(arr2));
		System.out.println("2.--------------------------");
		int[] arr3=new int[5];
		System.arraycopy(arr1, 0, arr3, 0, 5);
		System.out.println(arr1==arr3);
		System.out.println(java.util.Arrays.toString(arr3));
		System.out.println("3.--------------------------");
		int[] arr4=java.util.Arrays.copyOf(arr1, 5);
		System.out.println(arr1==arr4);
		System.out.println(java.util.Arrays.toString(arr4));
	}

}









