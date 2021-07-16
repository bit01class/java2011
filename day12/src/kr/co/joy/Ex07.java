package kr.co.joy;

public class Ex07 extends kr.co.tjoeun.Ex77{

	public static void main(String[] args) throws CloneNotSupportedException {
		// 접근제한자
		// open - public > protected >= default > private
		// class - public , default
		// 그외 - public, protected, default, private
		
		
		Ex07 ex77=new Ex07();
//		ex77.func1();
		ex77.func2();
		int[] arr={1,3,5};
		Object obj=arr.clone();
		System.out.println(arr);
		int[] arr2=(int[])(obj);
		for(int i=0; i<arr2.length ; i++){
			System.out.println(arr2[i]);
		}
	}

}
