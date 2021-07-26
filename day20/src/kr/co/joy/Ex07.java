package kr.co.joy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07 {

	public static void main(String[] args) {
		byte[] buf=new byte[2];
		File source =new File("video01.mp4");
		File target =new File("copy01.mpd4");
		try {
			target.delete();
			target.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		InputStream is=null;
		OutputStream os=null;
		java.io.BufferedInputStream bis=null;
		java.io.BufferedOutputStream bos=null;
		
		try {
			is=new FileInputStream(source);
			bis=new BufferedInputStream(is);
			
			os=new FileOutputStream(target);
			bos=new BufferedOutputStream(os);
			
			long before=System.currentTimeMillis();
			while(true){
				int su=bis.read(buf);
				if(su==-1){break;}
				bos.write(buf,0,su);
			}
			long after=System.currentTimeMillis();
			System.out.println("소요시간:"+(after-before)+"ms");
			// buffered 소요시간:91ms
			// buffered byte[16] 소요시간:18ms
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			// io 생성의 역순으로 close
			try {
				if(bos!=null){bos.close();}
				if(bis!=null){bis.close();}
				if(os!=null){os.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
