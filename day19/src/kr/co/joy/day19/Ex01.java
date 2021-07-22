package kr.co.joy.day19;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// IO (input&output) -file
		String path="D:\\javawork\\.\\..\\javawork\\.\\day19";
		System.out.println(path);
		java.io.File file=new java.io.File(path);
		System.out.println("존재하냐?"+file.exists());
		System.out.println("디렉토리냐?"+file.isDirectory());
		System.out.println("파일이냐?"+file.isFile());
		System.out.println("이름이머냐?"+file.getName());
		System.out.println("경로가머냐1?"+file.getPath());
		System.out.println("절대경로가머냐2?"+file.getAbsolutePath());
		
		try {
			System.out.println("절대경로가머냐3?"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("상위경로가머냐?"+file.getParent());
		System.out.println("파일사이즈는?"+file.length()+"byte");
		System.out.println("수정한날짜?"+new java.util.Date(file.lastModified()));
		System.out.println("읽기"+file.canRead());
		System.out.println("쓰기"+file.canWrite());
		System.out.println("실행"+file.canExecute());
		System.out.println("-----------------------------------");
		if(file.isDirectory()){
			java.io.File[] files=file.listFiles();
			for(int i=0; i<files.length; i++){
				System.out.println(files[i].getName());
			}
		}
	}

}






