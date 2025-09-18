
public class Character_array {

  public static void main(java.lang.String[] args) {

		char s[]= {'h','e','l','l','o'};  //s[0]=h, s[0]=h, s[1]=e, s[2]=l, s[3]=l, s[4]=o

		for(int i=0;i<s.length;i++){
            // Print through for loop
			System.out.print(s[i]);
		}
		System.out.println();

        // Print using Enhance for loop
		for(char x:s){
			System.out.print(x);
		}
	}
}
