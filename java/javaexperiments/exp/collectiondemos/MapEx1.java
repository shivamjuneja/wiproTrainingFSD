package exp.collectiondemos;

import java.util.*;

public class MapEx1 {

	public static void main(String args[]) {
		MapEx1 demo = new MapEx1();
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "one");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(5, "five");
		map2.put(6, "six");
		map.putAll(map2);
		String valueForKey2 = map.get(2);
		System.out.println("value for key 2 " + valueForKey2);
		demo.display(map);

		System.out.println("entry removed for key 2 ");
		map.remove(2);
		System.out.println("iterating on keys");
		demo.display(map);

		System.out.println("iterating on values");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println("value=" + value);
		}

		System.out.println("iterating on entries set");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
		    System.out.println("key="+key+" value="+value); 
		}
	}

	void display(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println("key=" + key + "value=" + value);
		}
	}

}
