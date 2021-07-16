package kr.co.joy;

public class Ex02 {

	public static void main(String[] args) {
		// Integer
		int su1=1234;
		int su2=1234;
		Integer su3=new Integer(1234);
		Integer su4=new Integer(1234);
		Integer su5=1234;
		Integer su6=1234;
		
		System.out.println(su1==su2);
		System.out.println(su3==su4);
		System.out.println(su3.equals(su4));
		System.out.println(su1==su3);
		System.out.println(su3==su5);
		System.out.println(su1==su5);
		System.out.println(su5==su6);
		System.out.println("------------------------");
		System.out.println(su3.intValue());
		long su7=su3.longValue();
		su3=new Integer(129);
		short su8=su3.shortValue();
		byte su9=su3.byteValue();
		System.out.println(su8);
		System.out.println(su9);
		String st1=su3.toString();
		String st2=su1+"";
		int su10=Integer.parseInt("1234");
		System.out.println(su10);
		Integer su11=Integer.valueOf("1234");
		System.out.println(su11);
		int su12=Integer.min(10, 100);
		System.out.println(su12);
		int su13=Integer.max(10, 100);
		System.out.println(su13);
		int su14=Integer.reverse(2);	// 1100
		System.out.println(su14);
		
		System.out.println("------------------------");
		int su15=16;
		System.out.println("2진수로 "+su15+"="+Integer.toBinaryString(su15));
		System.out.println("8진수로 "+su15+"=0"+Integer.toOctalString(su15));
		System.out.println("16진수로 "+su15+"=0x"+Integer.toHexString(su15));
		System.out.println("------------------------");
		System.out.println(Integer.compare(-150, 10));
	}

}










