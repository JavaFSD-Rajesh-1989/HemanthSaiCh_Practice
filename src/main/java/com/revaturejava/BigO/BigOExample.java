package BigO;

// Example for O(n) time complexity
public class BigOExample {
    
    // Method to print numbers from 0 to n-1
    public static void printNum(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i); // O(1) operation inside the loop
        }
    }
    
    public static void main(String[] args) {
        // Calling the method with n = 10
        printNum(10);
    }
}
