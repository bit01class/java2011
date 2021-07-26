package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06 {

	public static void main(String[] args) {
		byte[] buf=new byte[128];
		File source=new File("video01.mp4");
		File target=new File("copy01.mp4");
		try {
			target.delete();
			target.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream(source);
			os=new FileOutputStream(target);
			long before=System.currentTimeMillis();
			while(true){
				int su=is.read(buf);
				if(su==-1){break;}
				os.write(buf,0,su);
			}
			long after=System.currentTimeMillis();
			System.out.println("소요시간:"+(after-before)+"ms");
			// 2~3m -> non	buffer : 28472ms
			// 2~3m -> 2 	buffer : 14447ms
			// 2~3m -> 4 	buffer : 7355ms
			// 2~3m -> 16 	buffer : 1862ms
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







