package Lec27;

import Lec22.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				newarr[i] = arr[idx];

			}
			arr = newarr;
			front = 0;

		}
		super.Enqueue(item);
	}
	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(105);
		dq.Enqueue(109);
		dq.Enqueue(78);
		dq.Enqueue(19);
		dq.Display();
	}

}
