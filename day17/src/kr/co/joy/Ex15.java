package kr.co.joy;

import java.util.*;

public class Ex15 {

	public static void main(String[] args) {
		// 로또 번호 생성기 (ver 0.6.0)
		Random ran=new Random();
		Set lotto=new TreeSet();
		
		while(lotto.size()!=6){
			lotto.add(ran.nextInt(45)+1);
		}
		
		Iterator note=lotto.iterator();
		while(note.hasNext()){
			System.out.println(note.next());
		}
	}

}
