package kr.co.joy;

public class Ex06 {

	public static void main(String[] args) {
		//Q1. "ABCDEFG"���ڿ��� ���̸� ���Ͻÿ�
		//Q2. "ABCDEFG" -> "abcdefg"
		//Q3. "1234"�� �Է� �޾� 1234+1=?�������� ���ÿ�
		String target1="ABCDEFG";
		char[] arr1=target1.toCharArray();
		System.out.println(target1+"�� ���ڿ��� ���̴� "+arr1.length);
		System.out.println(target1.length());
		System.out.println(getLength(target1));
		System.out.println("-----------------------");
		byte[] arr2=target1.getBytes();
		// A+a-A -> a
		int[] arr3=new int[arr2.length];
		
		for(int i=0; i<arr3.length; i++){
			arr3[i]=arr2[i]+('a'-'A');
		}
		
		for(int i=0; i<arr3.length; i++){
			arr2[i]=(byte)arr3[i];
		}
		String result2=new String(arr2);
		System.out.println(result2);
		System.out.println(target1.toLowerCase());
		System.out.println(getLowerCase(target1));
		System.out.println("----------------------------");
		String target2="1234";
		int su=0;
		char[] arr4=target2.toCharArray();
//		su=(arr4[0]-48)*1000;
//		su+=(arr4[1]-48)*100;
//		su+=(arr4[2]-48)*10;
//		su+=(arr4[3]-48)*1;
		int cnt=0;
		int before=1;
		for(int i=3; i>=0; i--){
			su+=(arr4[i]-48)*before;
			before*=10;
		}
		System.out.println(su);
	}
	
	public static int getLength(String msg){
		char[] arr=msg.toCharArray();
		return arr.length;
	}
	
	public static String getLowerCase(String msg){
		byte[] arr2=msg.getBytes();
		// A+a-A -> a
		int[] arr3=new int[arr2.length];
		
		for(int i=0; i<arr3.length; i++){
			arr3[i]=arr2[i]+('a'-'A');
		}
		
		for(int i=0; i<arr3.length; i++){
			arr2[i]=(byte)arr3[i];
		}
		String result2=new String(arr2);
		return result2;
	}
}






