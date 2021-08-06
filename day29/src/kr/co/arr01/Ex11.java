package kr.co.arr01;

import java.io.File;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		File file=new File("test");
		if(file.exists()){
			if(file.isDirectory()){
				System.out.println("폴더");
			}else if(file.isFile()){
				System.out.println("파일");
			}
		}else{
			System.out.println("존재하지 않음");
			file.createNewFile();
		}
	}

}
