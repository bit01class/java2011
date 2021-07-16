package kr.co.joy;

public class Ex01 {

	public static void main(String[] args) {
		// 래퍼클래스 (기본자료형 -> class로)
		int su1=1234;
		Integer su2=new Integer(1234);
		Integer su3=1234;				// auto boxing(박싱)
		int su4=su2;					// unboxing(언박싱)
		Integer su5=su2+su3;
		Integer su6=new Integer("1234");
		
		System.out.println(su6+1);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
	}

}
