package kr.co.joy;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String spec="https://google.com";
		// ��������://ȣ��Ʈ:��Ʈ?�н�?����#��Ŀ
		// http - tcp/ip
		// 0�� ~ 1023��: �� �˷��� ��Ʈ (well-known port)
		// 1024�� ~ 49151��: ��ϵ� ��Ʈ (registered port)
		// 49152�� ~ 65535��: ���� ��Ʈ (dynamic port)
		
		java.net.URL url=null;
		try {
			url=new URL(spec);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
