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

	public int removeFirst() {

		Node rv = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			rv.next = null;
			size--;
		}
		return rv.data;
	}

	public int removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node sl = getNode(size - 2);
			int rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;

		}

	}

	public int removeAtindex(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		}
		else {
			
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.data;
		}
	}

}
