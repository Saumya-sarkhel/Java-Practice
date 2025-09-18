public class Concatenation {
    	public static void main(String[] args) {

		String string = "Hello";

		boolean present1 = string.contains("H");
		System.out.println(present1);

		boolean present2 = string.contains("h");
		System.out.println(present2);

		boolean present3 = string.contains("Hel");
		System.out.println(present3);

		boolean present4 = string.contains("Hl");
		System.out.println(present4);

	}
}
