package kr.co.joy;

public class Ex06{

  public static void main(String[] args){
	//String[] arr2=new String[]{"a","ab","abc"};
	//int[] arr1=new int[]{10,3,7,1,9};
	//System.out.println(arr1.length);
	
	int[] arr1=new int[5];
	for(int i=0; i<arr1.length; i++){
		arr1[i]=(i+1)*2;
	}
	arr1[2]=100;
	for(int i=0; i<arr1.length; i++){
		System.out.println(arr1[i]);
	}
	
  }

}