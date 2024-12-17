package first10;

public class StringReverse {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hemanth");
		System.out.println(sb.reverse());
		
		String s1=new String("Hemanth");
		int len =s1.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
	}

}
