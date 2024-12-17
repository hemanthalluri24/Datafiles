package first10;

public class IntegerReverse {
	public static void main(String[] args) {
		int a=12345;
		//rev = 54321;
		int rev=0;
		while(a!=0) {
			rev =rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
	}

}
