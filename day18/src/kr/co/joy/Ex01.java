package kr.co.joy;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List list1=new ArrayList();
		list1.add("0번째");
		list1.add("1번째");
		
		Set set1=new HashSet();
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");

		Set set2=new HashSet();
		set2.add("1번째");
		set2.add("2번째");
		set2.addAll(set1);

//		set2.remove("두번째");
		set2.removeAll(list1);
		
		Set set3=new HashSet();
		set3.add("세번째");
		set3.add("2번째");
		set3.add("첫번째");
		
		System.out.println(set2.contains("두번째"));
		System.out.println(set2.containsAll(set3));
		System.out.println(set2==set3);
		System.out.println(set2.equals(set3));
		System.out.println(set1.isEmpty());
		Object[] arr=set3.toArray();
		
		Iterator ite=set2.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}








