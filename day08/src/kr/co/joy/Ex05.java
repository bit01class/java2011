package kr.co.joy;

public class Ex05{

  public static void main(String[] args){
	// 배열
	// 자료형[] 변수명=new 자료형[갯수];
	// 변수명[인덱스]
	// 인덱스=0~갯수-1;
	//		0부터 순서대로
	// 동일 자료형 값을 여러개..
	//
	//자료형[] 변수명=new 자료형[]{ele,...};
	/*
	int[] arr=new int[4];
	arr[0]=2;
	arr[1]=4;
	arr[2]=6;
	arr[3]=8;
	int[] arr=new int[]{1,3,5,7,9};
	*/
	int[] arr={3,6,9,12,15};

	for(int i=0; i<6; i++){
		System.out.println(arr[i]);
	}
  }

}



