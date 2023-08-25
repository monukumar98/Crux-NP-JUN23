package Lec29;

public class Diameter_of_Binary_Tree_Opt {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).ld;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}

			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			int dp = ldp.ht + rdp.ht + 2;
			DiaPair sdp = new DiaPair();
			sdp.ld = Math.max(dp, Math.max(ldp.ld, rdp.ld));
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			return sdp;
		}
	}

	class DiaPair {
		int ld = 0;
		int ht = -1;
	}
}
