package first10;

public class StringManipulations {
	public static void main(String[] args) {
		String str = "The rains have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('e', str.indexOf('e')+1));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.lastIndexOf('e' , str.lastIndexOf('e')-1));
		System.out.println(str.indexOf("rains"));
		System.out.println(str.indexOf("Hemanth"));
		
		String s1="Hemanth";
		String s2="Hemanth";
		System.out.println(s1.equals(s2));
		
		
		String s3="Hemanth";
		String s4="hemanth";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(str.substring(4, 9));
		
		String s5="    Hemanth Alluri    ";
		System.out.println(s5.trim());
		
		
		System.out.println(s5.replace(" ", ""));
		String s6="01-01-2025";
		System.out.println(s6.replace('-', '/'));
		
		String s7="Hemanth Prasad Varma Alluri";
		String[] data= s7.split(" ");
		for(String elements : data) {
			System.out.println(elements);
		}
		System.out.println(s7.split(" "));
		
		
		String s8="Hemanth";
		String s9="Alluri";
		System.out.println(s8.concat(s9));
		
		int x=10;
		int y=20;
		System.out.println(s8+s9+x+y);
		System.out.println(x+y+s8+s9);
		System.out.println(s8+s9+(x+y));
	}

}
