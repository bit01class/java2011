package kr.co.joy;

public class Ex04 {

	public static void main(String[] args) {
		// StrinBuffer
		String st1="java";
		String st2=st1;
		st2=st2.concat("Web");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1==st2);
		System.out.println("--------------------------");
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=sb1.append("Web");
		sb2.append("Framework");
		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println(sb1==sb2);
		
	}

}







