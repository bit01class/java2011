package kr.co.joy;

public class Ex07 {

	public static void main(String[] args) {
		// �ζǹ�ȣ������(ver 0.1.0)
		int[] lotto=new int[45];
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		for(int i=0; i<10000; i++){
			int ran=(int)(Math.random()*44)+1;//1~44
			int temp=lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=temp;
		}
		
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+"\t");
		}
		System.out.println("���ʽ� ��ȣ:"+lotto[6]);
	}

}








