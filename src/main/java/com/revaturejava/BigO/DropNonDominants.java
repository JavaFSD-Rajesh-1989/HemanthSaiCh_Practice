package BigO;

public class DropNonDominants {
    
    public static void printNum(int n) {
        
        // Nested for loop: O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {    
                System.out.println(i + " " + j);
            }
        }
        
        // Standalone for loop: O(n)
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
        
        // Overall complexity: O(n^2) + O(n) = O(n^2 + n)
        // After dropping non-dominant terms: O(n^2)
    }
    
    public static void main(String[] args) {
        // Calling the method with n = 10
        printNum(10);
    }
}
