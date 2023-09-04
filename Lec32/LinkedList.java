package Lec32;

public class LinkedList<T> {
	public class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	public int size;

	public void addFirst(T item) {
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

	public void addLast(T item) {
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

	public void addAtIndex(int k, T item) throws Exception {
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

	public T getfirst() {
		return head.data;
	}

	public T getlast() {
		return tail.data;
	}

	public T Getatindex(int k) throws Exception {
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

	public T removeFirst() {

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

	public T removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node sl = getNode(size - 2);
			T rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;

		}

	}

	public T removeAtindex(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {

			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.data;
		}
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Harsh");
		ll.addLast("Riya");
		ll.addLast("Kaju");
		ll.addLast("Kajal");
		ll.Display();

	}
}
