package BigO;

public class DropConstants {
    
    // Method demonstrating O(2n) time complexity, which simplifies to O(n)
    public static void printNum(int n) {
        // First loop: O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        
        // Second loop: O(n)
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
    
    public static void main(String[] args) {
        // Calling the method with n = 10
        printNum(10);
    }
}
