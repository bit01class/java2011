package kr.co.sql01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		try(
				FileOutputStream fos=new FileOutputStream("test01.txt",true);
			){
			fos.write("1234".getBytes());
		}
		
	}

}










