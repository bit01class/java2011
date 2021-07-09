package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		// 다중배열
		char[] arr1={'A','B'};
		char[] arr2={'a','b','c'};
		char[][] arr3=new char[][]{arr1,arr2};
		char[][] arr5=new char[][]{{'A','B','C'},{'a','b'}};
		arr5[1][1]='d';
		
		
		char[][] arr4=new char[2][];
		arr4[0]=arr1;
		arr4[1]=arr2;
		
		char[][] arr6=new char[2][];
		arr6[0]=new char[]{'A','B','C'};
		arr6[1]=new char[]{'a','b'};
		
		char[][] arr7=new char[2][3];
		arr7[1]=new char[]{'x','y','z','a'};
		arr7[1][1]='e';
		
		for(int i=0; i<arr3.length; i++){
			for(int j=0; j<arr3[i].length; j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
