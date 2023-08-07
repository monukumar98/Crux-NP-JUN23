package Lec25;

import Lec23.LinkedList.Node;

public class Cyccle_Removal {
	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	public int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;

		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k to sahi deta ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() throws Exception {
		tail.next = getNode(2);
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

//O(N^2)
	public void Cycleremoval1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		while (slow != null) {// 1st node loop ke liye dekh liyes
			Node temp = meet;
			while (temp.next != meet) {// for cycle
				if (temp.next == slow) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			slow = slow.next;
		}
	}

//O(N)
	public void Cycleremoval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// count Cycle
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// fast move m steps ahead
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public void floyedcycle() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public static void main(String[] args) throws Exception {
		Cyccle_Removal cy = new Cyccle_Removal();
		cy.addLast(1);
		cy.addLast(2);
		cy.addLast(3);
		cy.addLast(4);
		cy.addLast(5);
		cy.addLast(6);
		cy.addLast(7);
		cy.addLast(8);
		cy.CreateCycle();
		cy.Cycleremoval1();
		cy.Display();
	}

}
