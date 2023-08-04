package Lec24;

import Lec24.Middle_of_the_Linked_List.ListNode;

public class Linked_List_Cycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public boolean hasCycle(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if (slow == fast) {
					return true;
				}
			}
			return false;
		}
	}
}
