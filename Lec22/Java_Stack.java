package Lec22;

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(-10);
		System.out.println(st.peek());//-10
		System.out.println(st);// 10 20 30 -10
		System.out.println(st.pop());//-10
		System.out.println(st);// 10 20 30
		System.out.println(st.size());//3
		System.out.println(st.isEmpty());//false

	}

}
