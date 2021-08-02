package kr.co.joy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {

	public static void main(String[] args) {
		String naver="https://www.7-zip.org/a/7z1900-x64.exe";
		URL url=null;
		URLConnection conn=null;
		InputStream is = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		File file=new File("download.exe");
		OutputStream os=null;
		try {
			url=new URL(naver);
			conn=url.openConnection();
			is = conn.getInputStream();
			os=new FileOutputStream(file);
			while(true){
				int su=is.read();
				if(su==-1){break;}
				os.write(su);
			}
//			isr=new InputStreamReader(is,Charset.forName("UTF-8"));
//			br=new BufferedReader(isr);
//			while(true){
//				String msg=br.readLine();
//				if(msg==null){break;}
//				System.out.println(msg);
//			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}








