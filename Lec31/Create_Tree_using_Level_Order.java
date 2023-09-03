package Lec31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_using_Level_Order {
	public class Node {
		int val;
		Node left;
		Node right;

	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public Create_Tree_using_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.poll();// remove krega
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rv.right = node;
				q.add(node);
			}
		}

	}

}
