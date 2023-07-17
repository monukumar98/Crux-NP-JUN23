package Lec13;

import java.util.ArrayList;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(20);
		ll.add(10);
		ll.add(29);
		ll.add(-9);
		ll.add(209);
		ll.add(45);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}
		
	}

}
