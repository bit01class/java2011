package kr.co.joy;

import java.io.InputStream;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		String msg="ab cd\n1234\n!@#$";
		Scanner sc=new Scanner(msg);
		while(sc.hasNext()){
			System.out.println(sc.next());
		}

	}

}







