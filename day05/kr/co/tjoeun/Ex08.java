package kr.co.tjoeun;

public class Ex08{

  public static void main(String[] args){
    int su=1;	
    int dan=2;
    while(su<10){
	dan=2;
	while(dan<10){
		System.out.print(dan+"x"+su+"="+dan*su+"\t");
		dan++;
	}	
	System.out.println();
         su++;
    }
  }

}