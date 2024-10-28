package BigO;

public class BigOExample3 {
	
	//O(1)
	public static int printNum(int n) {
		return n+n+n;
	}
	
	public static void main(String[] args) {
		int num = printNum(2);
		System.out.println(num);
	}

}
