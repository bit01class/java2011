package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		File file=new File("data10.bin");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("학생성적관리프로그램(ver 0.8.1)");
		Scanner sc=new Scanner(System.in);
		int input=0;
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("-------------------------------------");
				System.out.println("국어\t영어\t수학");
				System.out.println("-------------------------------------");
				byte[] buf=new byte[3];
				InputStream is=null;
				try {
					is=new FileInputStream(file);
					while(true){
						int su=is.read(buf);
						if(su==-1){break;}
						System.out.println(buf[0]+"\t"+buf[1]+"\t"+buf[2]);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						if(is!=null){is.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			if(input==2){
				OutputStream os=null;
				InputStream is=null;
				List<Byte> arr=new ArrayList<>();
				try {
					is=new FileInputStream(file);
					while(true){
						int su=is.read();
						if(su==-1){break;}
						arr.add((byte)su);
					}
					is.close();
					os=new FileOutputStream(file);
					for(int i=0; i<arr.size(); i++){
						os.write(arr.get(i));
					}
					System.out.print("국어>");
					input=sc.nextInt();
					os.write(input);
					System.out.print("영어>");
					input=sc.nextInt();
					os.write(input);
					System.out.print("수학>");
					input=sc.nextInt();
					os.write(input);
					os.flush();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(os!=null){os.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}












