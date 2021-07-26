package kr.co.joy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
//		Scanner sc=new Scanner(is);
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
	}

}
