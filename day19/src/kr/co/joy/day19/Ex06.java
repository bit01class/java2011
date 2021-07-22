package kr.co.joy.day19;

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		// rename
		File before=new File("test2.txt");
		File after=new File("test1.txt");
		boolean result=before.renameTo(after);
		System.out.println("rename:"+result);
	}

}
