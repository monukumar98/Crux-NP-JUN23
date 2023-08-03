package Lec23;

import Lec22.Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		reverse(q);
		q.Display();
	}
	public static void reverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int x = q.Dequeue();
		reverse(q);
		q.Enqueue(x);

	}

}
