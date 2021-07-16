package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.2.0)
		int[] lotto=new int[7];
		
		// 중복값검출
		for(int i=0; i<lotto.length; i++){
			int ran=(int)(Math.random()*45)+1;
			lotto[i]=ran;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		
		// sort
		for(int j=0; j<6-1; j++){
			for(int i=j+1; i<6; i++){
				if(lotto[j]>lotto[i]){
					int backup=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=backup;
					
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+"\t");
		}
	}

}
