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

class Ex06{

  public static void main(String[] args){
	int a=0;
	int cnt=0;
	int total=0;
	char ch='@';
	String msg="결과>";
	
	System.out.println("Q1. 1~10까지 짝수를 출력하시오");
	while((a+=2)<11){
		msg+=(a+" ");
	}
	System.out.println(msg);
	System.out.println("\nQ2. 1~10까지 홀수를 출력하시오");
	a=0;
	while(a++<10){
		if(a%2!=0){System.out.print(a+" ");}
	}
	System.out.println("\nQ3. 1~10까지의 합을 구하시오");
	a=0;
	while(a++<10){
		total+=a;
	}	
	System.out.println("1~10합은 "+total);
	System.out.println("\nQ4,Q7. A~Z까지 출력하시오");
	ch='A';
	while(ch<='Z'){
		System.out.print(ch+++"("+(char)(ch-1+('a'-'A'))+")");
	}
	System.out.println("\nQ5,Q6. 1,3,5,7,9를 출력하시오");
	msg="";
	a=0;
	cnt=0;
	while(++cnt<10){
		a++;
		if(a%2!=0){
		  msg+=a;
		}else{
		  msg+=',';
		}
	}
	System.out.println(msg+"=");
  }

}








