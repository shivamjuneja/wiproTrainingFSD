package exp.collectiondemos;

import java.util.*;

public class MapEx2 {

	public static void main(String args[]) {
		MapEx2 demo = new MapEx2();
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "one");	
		map.put(5, "five");
		map.put(6, "six");
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
	}

	void display(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println("key=" + key + "value=" + value);
		}
	}

}
