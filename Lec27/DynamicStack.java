package Lec27;

import Lec22.*;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(43);
		ds.push(41);
		ds.push(40);
		ds.Display();
	}
}
