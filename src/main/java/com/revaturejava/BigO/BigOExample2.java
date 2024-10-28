package BigO;

public class BigOExample2 {
    
    // Method to print pairs (i, j) for each i and j from 0 to n-1
    // This has O(n^2) time complexity
    public static void printNum(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {    
                System.out.println(i + " " + j); // O(1) operation inside the inner loop
            }
        }
    }
    
    public static void main(String[] args) {
        // Calling the method with n = 10
        printNum(10);
    }
}
