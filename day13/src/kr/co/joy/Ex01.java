package kr.co.joy;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó��
		/*
		 * try{
		 *		������ ���� �ְų� �ǽɵǴ� ��Ȳ �ڵ�
		 * }catch(ó�������� Ŭ���� ��������){
		 * 		catch ����� �ߵ��� ������ �ڵ�(�����߻��� ��ü�� �ڵ�)
		 * }
		 */
		
		System.out.println("main start...");
		int[] arr1={-3,-2,-1,0,1,2,3};
		for(int i=0; i<arr1.length; i++){
			try{
			System.out.println(0/arr1[i]);
			}catch(java.lang.ArithmeticException err){
				err.printStackTrace();
			}
		}
		
		System.out.println("main end...");
	}

}
