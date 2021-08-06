package kr.co.arr01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex12 {

	public static void main(String[] args) {
		File file1=new File("test");
		File file2=new File("D:\\20210607\\04day\\img\\img04.jpg");
		OutputStream os=null;	
		InputStream is=null;
		try {
			os=new FileOutputStream(file1);
			is=new FileInputStream(file2);
			while(true){
				int su=is.read();
				if(su==-1){break;}
				os.write(su);
			}
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
