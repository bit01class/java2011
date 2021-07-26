package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex04 {

	public static void main(String[] args) {
		String path=".\\test01\\ex02.txt";
		File file=new File(path);
		byte[] buf=new byte[4];
		InputStream is=null;
			try {
				is=new FileInputStream(file);
				while(true){
					int su=is.read(buf);
					if(su==-1){break;}
					System.out.print(new String(buf,0,su));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}

}










