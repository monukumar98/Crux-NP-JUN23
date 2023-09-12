package Lec34;

import java.util.PriorityQueue;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 3;

	}

	public static int Kth_Largest(int[] arr, int k) {
		PriorityQueue<Integer> pa = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pa.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (pa.peek() < arr[i]) {
				pa.poll();// remove
				pa.add(arr[i]);
			}
		}
		return pa.peek();

	}

}
