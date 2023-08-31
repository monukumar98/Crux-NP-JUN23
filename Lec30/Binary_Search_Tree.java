package Lec30;

public class Binary_Search_Tree {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Search_Tree(int[] arr) {
		// TODO Auto-generated constructor stub
		root = CreateTree(arr, 0, arr.length - 1);
	}

	private Node CreateTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		int mid =(si+ei)/2;
		Node nn = new Node();
		nn.val=arr[mid];
		nn.left=CreateTree(arr, si, mid-1);
		nn.right=CreateTree(arr, mid+1, ei);
		return nn;
	}

}
