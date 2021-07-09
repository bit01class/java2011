package kr.co.joy;
/*
다음을 출력하시오
Q1.			Q2.			Q3.
	★★★			1 2 3			1 2 3
	★★★			4 5 6			2 3 4
	★★★			7 8 9			3 4 5
Q4.			Q5.			Q6.
	A B C			1 			1 
	D E F			1 2 			2 3
	G H I			1 2 3			4 5 6
Q7.			Q8.			Q9.
	A			A 			★
	B C			A B 			★★
	D E F			A B C 			★★★
*/
public class Ex08{

  public static void main(String[] args){
	//1 2 3 * 2 3 4 * 3 4 5
	//1 2 3 4 * 2 3 4 5 * 3 4 5 6
	int ea=3;
	int su=ea-3;
	int limit=4+su;
	for(int i=1; limit<7+su; i++){
		if(i==limit){
			System.out.println();
			i=i-(3+su);
			limit++;
		}else{
			System.out.print(i);
		}
	}
  }

}






