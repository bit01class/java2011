package kr.co.sc04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	Socket sock;
	@Override
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			InetAddress addr = sock.getInetAddress();
			System.out.println(addr.getHostAddress()+"¥‘ ¿‘¿Â");
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			while(true){
				String msg=br.readLine();
				if(msg.equals("exit")){break;}
				System.out.println(msg);
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
			System.out.println(addr.getHostAddress()+"¥‘ ≈¿Â");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bw!=null){bw.close();}
				if(br!=null){br.close();}
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

	public static void main(String[] args) {
		ServerSocket serve=null;
		try {
			serve=new ServerSocket(5000);
			while(true){
				Socket sock = serve.accept();
				Server thr=new Server();
				thr.sock=sock;
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

