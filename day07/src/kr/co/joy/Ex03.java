package kr.co.joy;
/*
Q3.
	1 2 3
	2 3 4
	3 4 5
*/
public class Ex03{

  public static void main(String[] args){
	for(int j=0; j<3; j++){
		for(int i=1+j; i<4+j; i++){
			System.out.print(i);
		}
		System.out.println();
	}
  }

}