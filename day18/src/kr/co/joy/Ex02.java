package kr.co.joy;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Collection list=new TreeSet();
		list.add("1��°");
		list.add("2��°");
		list.add("3��°");
		list.add("4��°");
		list.add("2��°");
		
		Iterator ite=list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
