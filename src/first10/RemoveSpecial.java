package first10;

public class RemoveSpecial {
	public static void main(String[] args) {
		String s ="@#$%! Hemanth ***&$$% Prasad ^%$%) Varma 1234567890";
		String s2 =s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
	}

}
