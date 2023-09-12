package Lec34;

import java.util.*;


public class Min_Max_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//max heap
		pq.add(4);
		pq.add(5);
		pq.add(7);
		pq.add(1);
		pq.add(6);
		pq.add(9);
		pq.add(3);
		System.out.println(pq);

	}

}
