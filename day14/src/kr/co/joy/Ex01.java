package kr.co.joy;

public class Ex01 {

	public static void main(String[] args) {
		// ����Ŭ���� (�⺻�ڷ��� -> class��)
		int su1=1234;
		Integer su2=new Integer(1234);
		Integer su3=1234;				// auto boxing(�ڽ�)
		int su4=su2;					// unboxing(��ڽ�)
		Integer su5=su2+su3;
		Integer su6=new Integer("1234");
		
		System.out.println(su6+1);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
	}

}
