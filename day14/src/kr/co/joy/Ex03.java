package kr.co.joy;

public class Ex03 {

	public static void main(String[] args) {
		// Long
		long su1=1234L;
		Long su2=new Long(su1+"");
		Long su3=new Long("1234");
		
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(Long.MAX_VALUE);
		long su4=Long.parseLong("9223372036854775807");
		System.out.println(su4);
	}

}






