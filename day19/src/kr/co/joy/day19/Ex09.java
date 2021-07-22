package kr.co.joy.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		// Input stream
		File file=new File("test08.txt");
		try {
			FileInputStream is = new java.io.FileInputStream(file);
			int su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			su=is.read();
			System.out.println(su);
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
