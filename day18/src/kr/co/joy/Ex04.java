package kr.co.joy;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Map map1=new TreeMap();
		System.out.println(map1.isEmpty());
		map1.put("ó��", 1111);
		map1.put("����", 2222);
		map1.put("�Ǵ���", 3333);
		System.out.println(map1.isEmpty());
		Map map2=new HashMap();
		map2.putAll(map1);
		map2.remove("����");
		map2.remove("�Ǵ���", 4444);
		map2.replace("�Ǵ���", 4444);
		map2.clear();
		Collection col = map1.values();
		Iterator ite=col.iterator();
		System.out.println(map2.size());
		System.out.println(map2.get("�Ǵ���"));
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("------------------------------");
		Set keys=map1.keySet();
		ite=keys.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}






