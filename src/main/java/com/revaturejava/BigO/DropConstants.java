package BigO;

public class DropConstants {
	
	//O(2n) ---> Drop Constants ---> O(n)
	public static void printNum(int n) {
		for(int i=0; i<n; i++) {
			System.out.println(i);
		}
		for(int j=0; j<n; j++) {
			System.out.println(j);
		}
	}
	
	public static void main(String[] args) {
		printNum(10);
	}

}
