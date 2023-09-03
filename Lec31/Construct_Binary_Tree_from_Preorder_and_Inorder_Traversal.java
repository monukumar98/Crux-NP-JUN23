package Lec31;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);

		}

		public TreeNode Create(int[] in, int[] pre, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = Search(in, ilo, ihi, pre[plo]);
			int count = idx - ilo;
			node.left = Create(in, pre, ilo, idx - 1, plo + 1, plo + count);
			node.right = Create(in, pre, idx + 1, ihi, plo + count + 1, phi);
			return node;

		}

		public int Search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return -1;
		}

	}

}
