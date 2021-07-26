package kr.co.joy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 문자열 스트림

		File file =new File("ex01.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		String msg=sc.nextLine();
		char[] arr=msg.toCharArray();
		java.io.Writer fw=null;
		try {
			fw=new java.io.FileWriter(file);
			for(int i=0; i<arr.length; i++){
				fw.write(arr[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









