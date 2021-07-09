package kr.co.joy;
/*
Q5.				Q6.
	1 	1			1 
	1 2 	1+11			2 3
	1 2 3	1+11+111		4 5 6	
*/
public class Ex06{
  public static void main(String[] args){
	int cnt2=0;
	int su2=1;
	for(int i=1; i<=6; i++){
		System.out.print(i);
		cnt2++;
		if(cnt2==su2){
			System.out.println();
			cnt2=0;
			su2++;
		}
	}

	System.out.println("-----------------------------------------------");
	// start 1(1+0), 2(1+1), 4(1+1+2), 7(1+1+2+3)...
	int cnt=0;
	int start=1;
	int end=0;
	for(int j=0; j<3; j++){
		cnt=0;
		for(int i=start; i<=start+end; i++){
			System.out.print(i);
			cnt++;
		}
		start+=cnt;
		end++;
		System.out.println();
	}
	

	System.out.println("---------------------------------");	
	int su=1;
	for(int j=1; j<4; j++){
		for(int i=1; i<=j; i++){
			System.out.print(su++);
		}
		System.out.println();
	}
  }
}