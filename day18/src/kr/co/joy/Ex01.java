package kr.co.joy;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List list1=new ArrayList();
		list1.add("0��°");
		list1.add("1��°");
		
		Set set1=new HashSet();
		set1.add("ù��°");
		set1.add("�ι�°");
		set1.add("����°");

		Set set2=new HashSet();
		set2.add("1��°");
		set2.add("2��°");
		set2.addAll(set1);

//		set2.remove("�ι�°");
		set2.removeAll(list1);
		
		Set set3=new HashSet();
		set3.add("����°");
		set3.add("2��°");
		set3.add("ù��°");
		
		System.out.println(set2.contains("�ι�°"));
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








