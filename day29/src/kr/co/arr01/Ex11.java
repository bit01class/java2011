package kr.co.arr01;

import java.io.File;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		File file=new File("test");
		if(file.exists()){
			if(file.isDirectory()){
				System.out.println("����");
			}else if(file.isFile()){
				System.out.println("����");
			}
		}else{
			System.out.println("�������� ����");
			file.createNewFile();
		}
	}

}
