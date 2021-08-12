package kr.co.sql01;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		Set<Entry<Object, Object>> set = prop.entrySet();
		Iterator<Entry<Object, Object>> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
