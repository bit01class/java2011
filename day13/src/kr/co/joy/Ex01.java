package kr.co.joy;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		/*
		 * try{
		 *		오류가 날수 있거나 의심되는 상황 코드
		 * }catch(처리가능한 클래스 참조변수){
		 * 		catch 블록이 발동시 수행할 코드(에러발생시 대체될 코드)
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
