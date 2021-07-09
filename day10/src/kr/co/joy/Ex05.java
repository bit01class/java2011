package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		// 배열
		int[] arr1;
		arr1=new int[]{1,3,5,7,9};
		int arr2[];
		arr2=new int[]{2,4,6,8};

		Ex05 me=new Ex05();
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(me);
		
		int[] arr3=new int[4];	//배열의 선언과 초기화
		arr3[0]=1111;			//배열의초기화(x)
		arr3[1]=3333;
//		arr3[2]=5555;
		arr3[3]=4444;
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
	}

}














