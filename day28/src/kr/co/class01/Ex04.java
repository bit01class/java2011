package kr.co.class01;

import java.util.Scanner;

class Lec04{
	static Scanner sc=new Scanner(System.in);
}
class Lec44{
	Scanner sc=new Scanner(System.in);
}

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int su=Lec04.sc.nextInt();
		System.out.println(su);
		Lec44 lec44=new Lec44();
		su=lec44.sc.nextInt();
		System.out.println(su);
	}

}
