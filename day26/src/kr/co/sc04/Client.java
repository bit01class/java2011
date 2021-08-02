package kr.co.sc04;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Socket sock=null;
		
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			sock=new Socket("192.168.0.252",5000);
			
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			while(true){
				System.out.print(">>>");
				String msg=sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				msg=br.readLine();
				System.out.println(msg);
				if(msg==null){break;}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bw!=null){bw.close();}
				if(br!=null){br.close();}
				if(osw!=null){osw.close();}
				if(isr!=null){isr.close();}
				if(os!=null){os.close();}
				if(is!=null){is.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
