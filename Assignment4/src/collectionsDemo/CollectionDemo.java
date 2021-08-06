package collectionsDemo;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(4);
		l.add(1);
		l.add(5);
		
		System.out.println("Printing List: ");
		System.out.println(l);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add(1);
		set.add(5);
		
		System.out.println("Printing Set: ");
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "John");
		map.put(2, "Jane");
		map.put(3, "Mike");
		map.put(4, "Jonah");
		map.put(4, "Bill");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("Printing Map:");
		System.out.println(map);
		
	}
}
