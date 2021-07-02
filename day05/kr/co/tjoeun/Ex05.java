/* while문
Q1. 1~10까지 짝수를 출력하시오
Q2. 1~10까지 홀수를 출력하시오
Q3. 1~10까지의 합을 구하시오
Q4. A~Z까지 출력하시오
Q5. 1,3,5,7,9를 출력하시오
Q6. 2+4+6+8+10=000를 출력하시오
Q7. 다음의 형식을 출력하시오
	A(a) B(b) C(c) D(d) ... Z(z)
*/
package kr.co.tjoeun;

public class Ex05{

  public static void main(String[] args){
	int sum=0;
	int su=2;
	while(su<11){
	  if(su%2==0){
	    System.out.print(su);
	    sum+=su;
	  }else{
	    System.out.print('+');
	  }
	  su++;
	}
	System.out.println("="+sum);
	System.out.println("-------------------------");
	int ea='Z'-'A'+1;
	int gap='a'-'A';
	char ch='A';
	int i=0;
	while(i<ea){
	  System.out.print((char)(ch+i)
		+"("+(char)(ch+i+gap)+")");
	  i++;
	}
  }

}









