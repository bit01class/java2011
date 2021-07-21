package kr.co.joy;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Collection list=new TreeSet();
		list.add("1번째");
		list.add("2번째");
		list.add("3번째");
		list.add("4번째");
		list.add("2번째");
		
		Iterator ite=list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
