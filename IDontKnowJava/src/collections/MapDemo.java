package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import oops.Employee;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> studentInfo=new HashMap<>();
		Map<Integer, String> studentInfo=new TreeMap<>();
	
		studentInfo.put(101, "James");
		studentInfo.put(104, "Mike");
		studentInfo.put(102, "Kevin");
		studentInfo.put(105, "Peter");
		studentInfo.put(103, "Bob");
		//studentInfo.put(null, null);
		studentInfo.put(106, null);
		studentInfo.put(101, "Mark");
		
		System.out.println(studentInfo);
		
		Set<Entry<Integer,String>> set=studentInfo.entrySet();
//		
//		for(Entry<Integer,String> entry:set) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		Iterator<Entry<Integer, String>> items= set.iterator();
		
		while(items.hasNext()) {
			Entry<Integer, String> elem= items.next();
			System.out.println(elem.getKey()+" "+elem.getValue());
		}
		
		
	}

}
