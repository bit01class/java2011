package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) {
		File file=new File("ex05.bin");
		
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			is=new FileInputStream(file);
			isr=new InputStreamReader(is);
			int su=-1;
			while((su=isr.read())!=-1){
				System.out.print((char)su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
