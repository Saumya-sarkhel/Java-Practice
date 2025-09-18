
public class Str_compare {
    	public static void main(String[] args) {

		String s1 = "Ami";  //Ascii value of A=65,a=97
		String s2 = "ami";

		if(s1.compareTo(s2) > 0){
			System.out.println("S1 is grater than s2");
		}

		else if(s1.compareTo(s2) == 0){
			System.out.println("S2 == S1");
		}

		else {
			System.out.println("S2 > S1");
		}

		int value = s2.compareTo(s1);
		System.out.println(value);

	}

}
