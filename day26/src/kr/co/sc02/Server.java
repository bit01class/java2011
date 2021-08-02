package kr.co.sc02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// Echo server
		ServerSocket serve=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStreamWriter osw=null;
		try {
			serve=new ServerSocket(5000);
			sock=serve.accept();
			System.out.println("Á¢¼ÓµÊ");
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String msg=br.readLine();
			System.out.println("server:"+msg);
			
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			osw.write(msg);
			System.out.println("server write...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(osw!=null){osw.close();}
				if(os!=null){os.close();}
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
				if(sock!=null){sock.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
