package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>(5);
		hashSet.add("A");
		hashSet.add("B");
		System.out.println(hashSet.add(null));
		hashSet.add("c");
		hashSet.add("C");
		System.out.println(hashSet.add("C"));
		
		System.out.println(hashSet);
		System.out.println(hashSet.contains("A"));
		System.out.println(hashSet.contains("a"));
		
		hashSet.remove("A");
		System.out.println(hashSet);
		
	}
}
