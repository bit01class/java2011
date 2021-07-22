package kr.co.joy.day19;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		// dir
		java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String path=".";	//"d:\\javawork\\day19";
		
		if(args.length!=0){
			path=args[0];
		}
		
		File root=null;
		try {
			root = new File(path);// 상대&절대경로
			path=root.getCanonicalPath();
			root = new File(path);// 절대경로
		} catch (IOException e) {
			e.printStackTrace();
		}
		File[] files = root.listFiles();
		Date dat=new Date(root.lastModified());
		System.out.println(sdf.format(dat)+"\t<dir>\t\t.");
		File parent=new File(root.getParent());
		dat=new Date(parent.lastModified());
		System.out.println(sdf.format(dat)+"\t<dir>\t\t..");
		
		for(int i=0; i<files.length; i++){
			dat=new Date(files[i].lastModified());
			System.out.print(sdf.format(dat));
			System.out.print('\t');
			if(files[i].isDirectory()){
				System.out.print("<dir>");
				System.out.print("\t");
			}else{
				System.out.print("\t");
				System.out.print(files[i].length());
			}
			
			System.out.print('\t');
			System.out.println(files[i].getName());
		}

	}

}
