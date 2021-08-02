package kr.co.joy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05 {

	public static void main(String[] args) {
		// server
		java.net.ServerSocket serve=null;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			serve=new ServerSocket(5000);
			System.out.println("클라이언트 접속대기");
			sock=serve.accept();
			System.out.println("접속됨");
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			while(true){
				int su=isr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null){is.close();}
				if(sock!=null){sock.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
