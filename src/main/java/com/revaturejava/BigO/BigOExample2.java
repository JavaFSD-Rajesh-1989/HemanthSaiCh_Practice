package BigO;

public class BigOExample2 {
	
	// O(n^2)
	public static void printNum(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n ; j++) {	
				System.out.println(i +" "+j);
			}
		}
	}
	
	public static void main(String[] args) {
		printNum(10);
	}

}
