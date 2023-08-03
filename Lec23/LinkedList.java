package Lec23;

public class LinkedList {
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

	public void addAtIndex(int k, int item) throws Exception {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node k_1th = getNode(k - 1);
			Node nn = new Node();
			nn.data = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}
	public int getfirst() {
		return head.data;
	}
	public int getlast() {
		return tail.data;
	}
	public int Getatindex(int k) throws Exception {
		return getNode(k).data;
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

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

}
