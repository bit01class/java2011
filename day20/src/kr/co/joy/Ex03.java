package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		String path=".\\test01\\ex01.txt";
		File file=new File(path);
		InputStream is=null;
		try {
			is=new FileInputStream(file);
			Scanner sc=new Scanner(is);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}



