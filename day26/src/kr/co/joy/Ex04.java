package kr.co.joy;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex04 {

	public static void main(String[] args) {
		// client
		java.net.Socket sock=null;
		OutputStream os=null;
		try {
			sock=new Socket("localhost",5000);
			os=sock.getOutputStream();
			os.write("Ŭ���̾�Ʈ ��û�帳�ϴ�".getBytes());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
