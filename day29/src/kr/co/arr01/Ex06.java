package kr.co.arr01;

public class Ex06 {
	int a,b,c;
	String d;
	boolean e;

	public static void main(String[] args) {
		Ex06[] arr1=new Ex06[5];
		arr1[1]=new Ex06();
		arr1[2]=new Ex06();
		arr1[3]=new Ex06();
		System.out.println(java.util.Arrays.toString(arr1));
		arr1[1].a=1000;
		arr1[2].d="¹®ÀÚ¿­";
		arr1[3].e=true;
		System.out.println(arr1[3].a);
		System.out.println(arr1[3].b);
		System.out.println(arr1[3].d);
		System.out.println(arr1[3].e);
	}

}
