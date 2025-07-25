package collections;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "A");
		treeMap.put(3, "C");
		treeMap.put(2, "B");
		
		System.out.println(treeMap);
	}
}
