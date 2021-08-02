package kr.co.sc02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// 에코 클라이언트
		Socket sock=null;
		Scanner sc=new Scanner(System.in);
		OutputStream os=null;
		InputStream is=null;
		OutputStreamWriter osw=null;
		InputStreamReader isr=null;
		try {
			sock=new Socket("127.0.0.1",5000);
			
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			System.out.print(">>>");
			String msg=sc.nextLine();
			osw.write(msg+"\r\n");
			osw.flush();	// 버퍼를 밀어냄
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			while(true){
				int su=isr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(isr!=null){isr.close();}
				if(osw!=null){osw.close();}
				if(is!=null){is.close();}
				if(os!=null){os.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
