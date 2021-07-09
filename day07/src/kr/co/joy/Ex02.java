package kr.co.joy;
/*
Q2.		
	1 2 3	
	4 5 6	
	7 8 9	
*/
public class Ex02{

  public static void main(String[] args){
	for(int i=1; i<10; i++){
		System.out.print(i);
		if(i%3==0){System.out.println();}
	}
	System.out.println("-------------------------------------");
	for(int j=0;j<3;j++){
		for(int i=1+3*j; i<4+3*j; i++){
			System.out.print(i);
		}	
		System.out.println();
	}
  }

}







