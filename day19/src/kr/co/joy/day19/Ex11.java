package kr.co.joy.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File file=new File("test08.txt");
		byte[] bys=new byte[(int)file.length()];
		FileInputStream is=null;
		try {
			is=new FileInputStream(file);
			int cnt=0;
			while(true){
				int su=is.read();
				if(su==-1){break;}
				bys[cnt++]=(byte)(su);
			}
			System.out.println(new String(bys));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
