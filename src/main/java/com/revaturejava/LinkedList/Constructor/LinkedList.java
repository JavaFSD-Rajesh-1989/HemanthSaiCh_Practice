package LinkedList.Constructor;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	// Inner Class
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor to initialize LinkedList with one node
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// Method to print the list
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// Method to get head value
	public void getHead() {
		System.out.println("Head: " + head.value);
	}

	// Method to get tail value
	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}

	// Method to get the length of the list
	public void getLength() {
		System.out.println("Length: " + length);
	}

}
