package collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("c");
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		
		System.out.println(treeSet.add("C"));

		System.out.println(treeSet);
		System.out.println(treeSet.contains("A"));
		System.out.println(treeSet.contains("a"));

		treeSet.remove("A");
		System.out.println(treeSet);

	}
}
