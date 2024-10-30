package LinkedList;

import java.util.*;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		// 1. Append - add() method
		// LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10); // O(1)
		linkedList.add(20); // O(1)
		linkedList.add(30); // O(1)
		System.out.println("LinkedList after appending: " + linkedList);
		
		// ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10); // O(1)
		arrayList.add(20); // O(1)
		arrayList.add(30); // O(1)
		System.out.println("ArrayList after appending: " + arrayList);
		
		// 2. Remove Last - remove() last element
		linkedList.remove(linkedList.size() - 1); // O(n)
		System.out.println("LinkedList after removing last: " + linkedList);
		
		arrayList.remove(arrayList.size() - 1); // O(1)
		System.out.println("ArrayList after removing last: " + arrayList);
		
		// 3. Prepend - add() at the start
		linkedList.addFirst(9); // O(1)
		System.out.println("LinkedList after prepending 9: " + linkedList);
		
		arrayList.add(0, 9); // O(n) because it shifts elements and index
		System.out.println("ArrayList after prepending 9: " + arrayList);
		
		// 4. Remove First - remove() first element
		linkedList.removeFirst(); // O(1)
		System.out.println("LinkedList after removing first: " + linkedList);
		
		arrayList.remove(0); // O(n) because it shifts elements and index
		System.out.println("ArrayList after removing first: " + arrayList);
		
		// 5. Insert - add() at specific index
		linkedList.add(1, 15); // O(n) due to traversal
		System.out.println("LinkedList after inserting 15 at index 1: " + linkedList);
		
		arrayList.add(1, 15); // O(n) because it shifts elements
		System.out.println("ArrayList after inserting 15 at index 1: " + arrayList);
		
		// 6. Remove - remove() by index
		linkedList.remove(1); // O(n) due to traversal
		System.out.println("LinkedList after removing element at index 1: " + linkedList);
		
		arrayList.remove(1); // O(n) because it shifts elements
		System.out.println("ArrayList after removing element at index 1: " + arrayList);
		
		// 7. Lookup by Index - get() by index
		System.out.println("Element at index 1 in LinkedList: " + linkedList.get(1)); // O(n) due to traversal
		System.out.println("Element at index 1 in ArrayList: " + arrayList.get(1));   // O(1) because of direct indexing
		
		// 8. Lookup by Value - contains() method
		System.out.println("LinkedList contains 10: " + linkedList.contains(10)); // O(n)
		System.out.println("ArrayList contains 10: " + arrayList.contains(10));   // O(n)
	}
}
