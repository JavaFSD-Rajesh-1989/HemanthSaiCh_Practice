package LinkedList.RemoveLast;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(4);
		linkedList.append(2);
		linkedList.append(3);

		// 3 Items - Returns 3
		System.out.println(linkedList.removeLast().value);
		// 2 Item - Returns 2
		System.out.println(linkedList.removeLast().value);
		// 1 Items - Returns 1
		System.out.println(linkedList.removeLast().value);
		// 0 Items - Returns null
		System.out.println(linkedList.removeLast());
	}
}


