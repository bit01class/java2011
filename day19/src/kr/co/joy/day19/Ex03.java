package kr.co.joy.day19;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// create file
		File file=new File("test1.txt");
//		new File(file.getParent()).mkdir();
//		if(!file.exists()){
			try {
				boolean result=file.createNewFile();
				System.out.println("create :"+result);
			} catch (IOException e) {
				e.printStackTrace();
			}
//		}
	}

}
