package BigO;

public class BigOExample3 {
    
    // Method that performs a constant-time operation
    // O(1) time complexity
    public static int printNum(int n) {
        return n + n + n; // Returns three times the value of n
    }
    
    public static void main(String[] args) {
        int num = printNum(2); // Calling the method with n = 2
        System.out.println(num); // Output: 6
    }
}
