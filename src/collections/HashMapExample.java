package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a",10);
		hashMap.put("b", 20);
		hashMap.put("c", 30);
		
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		
		if(hashMap.containsKey("a")) {
			Integer a = hashMap.get("a");
			System.out.println(a);
		}
		
		for(String key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
		}
		
		for(Entry<String,Integer> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
