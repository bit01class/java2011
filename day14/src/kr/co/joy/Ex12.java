package kr.co.joy;

public class Ex12 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��(ver 0.4.0) - �ѱ����� 
		// �ֹι�ȣ >>> ���̿��Ͽ���-�����̻�����
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�ֹι�ȣ �˻��(ver 0.4.0)");
		String input=null;
		char gender='��';
		int year=0;
		String[] arr2={"��","��","��","��","��","��","��","ĥ","��","��","�ϳ�","�ټ�","��","����","��"};
		String[] arr3={"0","1","2","3","4","5","6","7","8","9","1","5","2","1","2"};
		while(true){
		System.out.print("�ֹι�ȣ>");
			input=sc.nextLine();
//			char[] arr=input.toCharArray();
//			for(int i=0; i<arr.length; i++){
//				for(int j=0; j<arr2.length; j++){
//					if(arr[i]==arr2[j]){arr[i]=(char)(j+'0');}
//				}
//			}
//			input=new String(arr);
			for(int i=0; i<arr2.length; i++){
				input=input.replace(arr2[i], arr3[i]);
			}
			//valid
			year=Integer.parseInt(input.substring(0,2));
			if(input.charAt(7)>'2'){year+=100;}
			if('1'%2==input.charAt(7)%2){gender='��';}
			break;
		}
		System.out.println("����� "+(122-year)+"�� "+gender+"���Դϴ�");
		
	}

}








