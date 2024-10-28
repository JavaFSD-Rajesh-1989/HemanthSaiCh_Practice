package BigO;

import java.util.ArrayList;

public class BigOArrayList {
    
    public static void main(String[] args) {
        
        // Creating an ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println("Initial List: " + myList);
        
        // O(1) - Adding an element
        myList.add(40);
        System.out.println("After adding 40 at index 3: " + myList);
        
        // O(1) - Removing an element
        myList.remove(3);
        System.out.println("After removing element at index 3: " + myList);
        
        // O(n) - Removing the first element (shifts elements)
        myList.remove(0);
        System.out.println("After removing element at index 0: " + myList);
        
        // O(n) - Adding an element at index 0 (shifts elements)
        myList.add(0, 10);
        System.out.println("After adding 10 at index 0: " + myList);
    }
}
