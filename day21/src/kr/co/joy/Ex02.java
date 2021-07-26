package kr.co.joy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("ex01.txt");
		java.io.Reader fr=null;
		try {
			fr=new java.io.FileReader(file);
			while(true){
				int su=fr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
