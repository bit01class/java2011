package kr.co.joy.day19;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		//create directory
		File file=new File("ex01\\ex001\\ex0001");
		boolean result=file.mkdirs();
		System.out.println("make directory:"+result);
	}

}
