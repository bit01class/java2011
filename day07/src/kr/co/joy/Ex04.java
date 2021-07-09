package kr.co.joy;
/*
Q4.		
	A B C
	D E F
	G H I
*/
public class Ex04{

  public static void main(String[] args){
	for(int j=0; j<3; j++){
		for(int i=65+3*j; i<68+3*j; i++){
			System.out.print((char)i);
		}
		System.out.println();
	}
	System.out.println("-------------------");
	char abc='A';
	for(int i=0; i<9; i++){
		System.out.print(abc++);
		if((i+1)%3==0){System.out.println();}
	}
  }

}





