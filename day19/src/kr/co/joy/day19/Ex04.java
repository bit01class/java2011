package kr.co.joy.day19;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		// delete file
		File file=new File("ex01");
		File[] files=file.listFiles();
		for(int i=0; i<files.length; i++){
			files[i].delete();
		}
		boolean result=file.delete();
		System.out.println("delete:"+result);
	}

}
