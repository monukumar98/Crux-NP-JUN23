package Lec28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		str = "<--" + str + nn.val + "-->";
		if (nn.left != null) {
			str = nn.left.val + str;

		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;

		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);

		return Math.max(nn.val, Math.max(left, right));
	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}

	public int ht() {

		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.println(node.val + " ");
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}

	public void LevelOrder() {
		// LinkedList<Node> q = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.val + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
		System.out.println();
	}
}
