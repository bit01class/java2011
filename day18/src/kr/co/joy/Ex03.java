package kr.co.joy;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// MapŸ��
		// put(key, val);
		// get(key);
		// key- �ߺ�(����), null(�ߺ��ü���)
		// val- �ߺ�����, null(�ߺ�����)
		java.util.Map map1=new java.util.HashMap();
		map1.put(1, 1111);
		map1.put(2.0, 3.14);
		map1.put(true, "���ڿ�");
		map1.put("�׹�°", "���ڿ�");
		map1.put(true, "�ٲ�");
		map1.put('A', null);
		map1.put(null, null);
		map1.put(null, "�ξƴ�");
		
		
		Set entrys = map1.entrySet();
		Iterator ite2 = entrys.iterator();
		while(ite2.hasNext()){
			java.util.Map.Entry entry=(Entry) ite2.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
//		java.util.Set keys=map1.keySet();
//		java.util.Iterator ite=keys.iterator();
//		while(ite.hasNext()){
//			Object key=ite.next();
//			System.out.println(key+" : "+map1.get(key));
//		}
		
//		System.out.println(map1.get(1));
//		System.out.println(map1.get(2.0));
//		System.out.println(map1.get(true));
//		System.out.println(map1.get("�׹�°"));
//		System.out.println(map1.get('A'));
//		System.out.println(map1.get(null));
//		System.out.println(map1.get("ù��°"));
	}

}
