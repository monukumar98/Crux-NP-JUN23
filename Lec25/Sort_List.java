package Lec25;

import Lec24.Middle_of_the_Linked_List.ListNode;

public class Sort_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}

			ListNode mid = middleNode(head);
			ListNode headb = mid.next;
			mid.next = null;
			ListNode A = sortList(head);
			ListNode B = sortList(headb);
			return mergeTwoLists(A, B);

		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode A = list1;
			ListNode B = list2;
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (A != null && B != null) {
				if (A.val < B.val) {
					Dummy.next = A;
					A = A.next;
					Dummy = Dummy.next;
				} else {
					Dummy.next = B;
					B = B.next;
					Dummy = Dummy.next;
				}
			}
			if (A != null) {
				Dummy.next = A;
			}
			if (B != null) {
				Dummy.next = B;
			}
			return temp.next;

		}

		public ListNode middleNode(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast.next != null && fast.next.next != null) {// 1st mid in Even length
				fast = fast.next.next;
				slow = slow.next;
			}
			return slow;

		}

	}
}
