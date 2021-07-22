package kr.co.joy.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		File file=new File("test08.txt");
		File dest=new File("test13.txt");
		try {
			dest.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream is=null;
		FileOutputStream os=null;
		
		try {
			is=new FileInputStream(file);
			os=new FileOutputStream(dest);
			
			while(true){
				int su=is.read();
				if(su==-1){break;}
				os.write(su);
			}
			System.out.println("파일복사 끝...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null){is.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
