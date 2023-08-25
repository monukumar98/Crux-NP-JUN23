package Lec29;

import java.util.*;

public class Right_Side_View_Tree {
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
		int max_dpth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			rightSide(root, 1, ans);
			return ans;
		}

		public void rightSide(TreeNode root, int lv, List<Integer> ans) {
			if (root == null) {
				return;
			}
			if (lv > max_dpth) {
				ans.add(root.val);
				max_dpth = lv;
			}
			rightSide(root.right, lv + 1, ans);
			rightSide(root.left, lv + 1, ans);

		}
	}
}
