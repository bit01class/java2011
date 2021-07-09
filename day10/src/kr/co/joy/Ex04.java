package kr.co.joy;

public class Ex04 {

	public static int compare(String msg1,String msg2){
		for(int i=0; i<msg1.length(); i++){
			int ch1=msg1.charAt(i);
			int ch2=msg2.charAt(i);
			int lng=ch1-ch2;
			if(lng!=0){return lng;}
		}
		int lng=msg1.length()-msg2.length();
		if(lng!=0){return lng;}
		return 0;
	}
	
	public static void main(String[] args) {
		String st1="javaaaa";
		String st2="jaVa";
		
		System.out.println(st1.compareTo(st2));
		System.out.println(compare(st1,st2));

	}

}
