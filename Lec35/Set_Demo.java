package Lec35;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(-9);
		set.add(90);
		set.add(29);
		set.add(35);
		set.add(2);
		set.add(11);
	//	set.add(-9);
		System.out.println(set);
//		System.out.println(set.remove(11));
//		System.out.println(set);
//		System.out.println(set.contains(-9));
//		System.out.println(set.contains(-90));
//		System.out.println(set.size());
//		for (int val : set) {
//			System.out.print(val + " ");
//		}
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(-9);
		set1.add(90);
		set1.add(29);
		set1.add(35);
		set1.add(2);
		set1.add(11);
		//set.add(-9);
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(-9);
		set2.add(90);
		set2.add(29);
		set2.add(35);
		set2.add(2);
		set2.add(11);
		set.add(-9);
		System.out.println(set2);
	}

}
