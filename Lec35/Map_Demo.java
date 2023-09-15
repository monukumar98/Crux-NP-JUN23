package Lec35;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// Add
		map.put("Raj", 87);
		map.put("Ankit", 79);
		map.put("Pooja", 68);
		map.put("Niraj", 67);
		map.put("Amit", 59);
		map.put("Amisha", 48);
		map.put("Rahul", 69);
		map.put("Kaju", 68);
		// map.put(null, 89);
		// map.put("Pooja", 48);
		System.out.println(map);
//		// remove
//		System.out.println(map.remove("Kaju"));
//		System.out.println(map.remove("Vishal"));
//		System.out.println(map);
//		// get
//		System.out.println(map.get("Amisha"));
//		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Vishal"));
//		System.out.println(map.containsKey("Pooja"));
//		//size
//		System.out.println(map.size());

		TreeMap<String, Integer> map1 = new TreeMap<>();
		// Add
		map1.put("Raj", 87);
		map1.put("Ankit", 79);
		map1.put("Pooja", 68);
		map1.put("Niraj", 67);
		map1.put("Amit", 59);
		map1.put("Amisha", 48);
		map1.put("Rahul", 69);
		map1.put("Kaju", 68);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// Add
		map2.put("Raj", 87);
		map2.put("Ankit", 79);
		map2.put("Pooja", 68);
		map2.put("Niraj", 67);
		map2.put("Amit", 59);
		map2.put("Amisha", 48);
		map2.put("Rahul", 69);
		map2.put("Kaju", 68);
		System.out.println(map2);
//		Set<String> set = map.keySet();
//		System.out.println(set);
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
