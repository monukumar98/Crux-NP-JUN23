package Lec28;

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

}
