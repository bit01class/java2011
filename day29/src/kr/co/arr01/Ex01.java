package kr.co.arr01;

public class Ex01 {

	public static void main(String[] args) {
		// �迭
		// �ڷ���[] ������ = new �ڷ���[����];
		// �ε��� - 0���� ~ ����-1
		int[] arr1;		//������ ����
		arr1=new int[5];//������ �ʱ�ȭ
		arr1[2]=2222;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println("---------------------------");
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("----------------------------");
		System.out.println(java.util.Arrays.toString(arr1));
	}

}










