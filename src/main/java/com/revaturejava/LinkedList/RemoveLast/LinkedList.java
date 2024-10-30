package LinkedList.RemoveLast;

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
	
	// Method to append element in list
	public void append(int value) {
		Node newNode = new Node(value);
		
		if(length==0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	// Method to remove last element in list
	public Node removeLast() {
		if(length==0) return null;
		Node temp = head;
		Node pre = head;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
		
	}

}
