package kr.co.joy;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String spec="https://google.com";
		// 프로토콜://호스트:포트?패스?쿼리#앵커
		// http - tcp/ip
		// 0번 ~ 1023번: 잘 알려진 포트 (well-known port)
		// 1024번 ~ 49151번: 등록된 포트 (registered port)
		// 49152번 ~ 65535번: 동적 포트 (dynamic port)
		
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
