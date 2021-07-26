package kr.co.joy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("ex01.txt");
		
		InputStream is=null;
		java.io.ByteArrayOutputStream baos=null;
		java.io.ByteArrayInputStream bais=null;
		try {
			is=new FileInputStream(file);
			baos=new ByteArrayOutputStream();
			
			int su=-1;
			while((su=is.read())!=-1){
				baos.write(su);
			}
			byte[] temp=baos.toByteArray();
			System.out.println(new String(temp));
			bais=new ByteArrayInputStream(temp);
			while(true){
				int su2=bais.read();
				if(su2==-1){break;}
				System.out.print(su2+",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bais!=null){bais.close();}
				if(baos!=null){baos.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}










