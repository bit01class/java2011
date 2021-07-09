package kr.co.joy;

public class Ex02 {

	public static void main(String[] args) {
		// String class
		String st1="JavaWebFramework";
		String st2="aWeb";
		System.out.println(st1.contains(st2));
		System.out.println("-----------------------");
		System.out.println(st1.startsWith("Java"));
		System.out.println(st1.startsWith("Web"));
		System.out.println(st1.endsWith("Framewor"));
		System.out.println(st1.endsWith("work"));
		System.out.println("-----------------------");
		byte[] arr1=new byte[3];
		st1.getBytes(4,7,arr1,0);
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]+","+(char)arr1[i]);
		}
		System.out.println("-----------------------");
		char[] arr2=new char[4];
		st1.getChars(0, 4, arr2, 0);
		
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------");
		int idx=st1.indexOf("java");
		System.out.println(idx);
		System.out.println("-----------------------");
		System.out.println(st1.replace("Web", "DB"));
		System.out.println(st1);
		System.out.println(st1.replace("Web", ""));
		System.out.println(st1.replace("Web", "DBWeb"));
		System.out.println(st1.replace("aW", "AW"));
		System.out.println("-----------------------");
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println("-----------------------");
		String st3="        ja     va        ";
		
		System.out.println(">>>>"+st3.trim()+"<<<<");
	}

}





