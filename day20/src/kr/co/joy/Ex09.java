package kr.co.joy;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex09 {
	static List<String> list=new ArrayList<>();
	
	public static void save(){
		File data=new File("data09.bin");
		if(!data.exists()){
			try {
				data.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutputStream os=null;
		PrintStream ps=null;
		try {
			os=new FileOutputStream(data);
			ps=new PrintStream(os);
			
			for(int i=0; i<list.size(); i++){
				String msg=list.get(i);
				ps.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null){ps.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void load(){
		File data=new File("data09.bin");
		byte[] buf=new byte[12];
		InputStream is=null;
		BufferedInputStream bis=null;
		
		try {
			is=new FileInputStream(data);
			bis=new BufferedInputStream(is);
			int cnt=0;
			while(true){
				int su=bis.read();
				if(su==-1){break;}
				else if(su==13){}
				else if(su==10){
					String msg=new String(buf);
					list.add(msg);
					cnt=0;
					buf=new byte[12];
				}
				else{
					buf[cnt++]=(byte)su;
//					System.out.print((char)su);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bis!=null){bis.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.8.0)
		// 1.보기 2.입력 0.종료>
		load();
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextLine();
			if("0".equals(input)){break;}
			if("1".equals(input)){
				System.out.println("-------------------------------------------");
				System.out.println("국어\t영어\t수학");
				System.out.println("-------------------------------------------");
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i));
				}
			}
			if("2".equals(input)){
				System.out.print("국어>");
				input=sc.nextLine()+"\t";
				System.out.print("영어>");
				input+=sc.nextLine()+"\t";
				System.out.print("수학>");
				input+=sc.nextLine();
				list.add(input);
				save();
			}
		}
	}

}












