package BigO;

import java.util.ArrayList;
public class BigOArrayList {
	
	public static void main(String[] args) {
		
		//Creating ArrayList
		ArrayList<Integer> myList = new ArrayList<>();
		
		//Adding elements
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println(myList);
		
		// O(1) 
		myList.add(40);
		System.out.println("40 added at index 3"+myList);
		myList.remove(3);
		System.out.println("element removed at index 3"+myList);
		
		//O(n)
		myList.remove("element removed at index 0"+0);
		System.out.println(myList);
		myList.add(0, 10);
		System.out.println("0 added at index 0"+myList);

		
	}
	

}
