/*
Q1. 1~10까지 짝수를 출력하시오
Q2. 1~10까지 홀수를 출력하시오
Q3. 1~10까지의 합을 구하시오
Q4. A~Z까지 출력하시오
Q5. 1,3,5,7,9를 출력하시오
Q6. 2+4+6+8+10=000를 출력하시오
Q7. 다음의 형식을 출력하시오
	A(a) B(b) C(c) D(d) ... Z(z)
*/

class Ex04{

  public static void main(String[] args){
	System.out.println("Q1~2. 1~10까지 짝수를 출력하시오");
	System.out.println("1-----------------");
	for(int i=1; i<=10; i+=2){
	  System.out.print(i+" ");
	}
	System.out.println("\n2-----------------");
	//1~10출력, 짝수만
	for(int i=1; i<=10; i++){
	   if(i%2==1){
		System.out.print(i+" ");
	   }
	}
	System.out.println("\nQ3. 1~10까지의 합을 구하시오");
	int sum3=0;
	for(int i=1; i<=10; i++){
		sum3+=i;
	}
	System.out.println("1~10까지의 합은 "+sum3);
	//  1 2 3 4 5
	// 10 9 8 7 6
	int before=0;
	int cnt=0;
	for(int i=1, j=10; before!=i ;i++,j--){
		before=j;
		cnt++;
	}
	System.out.println("1~10까지의 합은 "+11*cnt);
	System.out.println("Q4. A~Z까지 출력하시오");
	for(char ch='A'; ch<='Z'; ch++){
	  System.out.print(ch+" ");
	}
	System.out.println();
	
	cnt='Z'-'A'+1;
	int gap='a'-'A';
	for(int i=0; i<cnt; i++){
	  char ch=(char)('A'+i);
	  System.out.print(ch +"("+(char)(ch+gap)+")");
	}
	System.out.println();
	System.out.println("Q5. 1,3,5,7,9를 출력하시오");
	for(int i=1; i<10; i+=2){
		if(i!=1){System.out.print(",");}
		System.out.print(i);
	}
	System.out.println();
	for(int i=1; i<10; i++){
	  if(i%2==0){
	     System.out.print(',');
	  } else {System.out.print(i);}
	}
	System.out.println();
	System.out.println("Q6. 2+4+6+8+10=000를 출력하시오");
	int sum6=0;
	int limit=10;
	for(int i=2; i<=limit+1; i++){
	  if(i%2==0){
		System.out.print(i);
		sum6+=i;
	  }else{
		if(i==limit+1){System.out.print('=');
		}else{System.out.print('+');}
	  }
	}
	System.out.println(sum6);
  }

}








