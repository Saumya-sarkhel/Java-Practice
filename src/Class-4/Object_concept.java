public class Object_concept {

  public static void main(String[] args) {

    // Strings created using string literals are stored in the String Constant Pool.
    String s1 = "hello";
    String s2 = "World";
    String s3 = "hi";
    String s4 = "hello"; // s4 refers to the same object as s1 (because of string pool)
    String s5 = "Hello"; // Different from "hello" due to case sensitivity

    // Strings created using 'new' keyword are stored in the heap, not in the String
    // Constant Pool.
    String str1 = new String("hello");
    String str2 = new String("World");
    String str3 = new String("hello");

    // hashCode() returns the same value for strings with identical content
    // (case-sensitive)
    System.out.println("Hash codes of string literals:");
    System.out.println("s1.hashCode(): " + s1.hashCode()); // 99162322
    System.out.println("s2.hashCode(): " + s2.hashCode()); // 83766130
    System.out.println("s3.hashCode(): " + s3.hashCode()); // 3329
    System.out.println("s4.hashCode(): " + s4.hashCode()); // 99162322 (same as s1)
    System.out.println("s5.hashCode(): " + s5.hashCode()); // 69609650 (different due to case)

    System.out.println("\nHash codes of strings created with new keyword:");
    System.out.println("str1.hashCode(): " + str1.hashCode()); // 99162322 (same content as s1)
    System.out.println("str2.hashCode(): " + str2.hashCode()); // 83766130 (same content as s2)
    System.out.println("str3.hashCode(): " + str3.hashCode()); // 99162322 (same content as s1 and str1)

    System.out.println("\nReference Comparison (==):");
    if (s1 == str1) {
      System.out.println("s1 == str1 : Same object");
    }
    else {
      System.out.println("s1 == str1 : Different objects"); // Different: s1 is from pool, str1 is from heap
    }


    if (s1 == s4) {
      System.out.println("s1 == s4 : Same object"); // Same: both refer to the same object in the pool
    }
    else {
      System.out.println("s1 == s4 : Different objects");
    }


    System.out.println("\nValue Comparison (.equals()):");
    if (s1.equals(s4)) {
      System.out.println("s1.equals(s4) : Same value"); // True: content is the same
    }
    else {
      System.out.println("s1.equals(s4) : Different value");
    }


    if (s1.equals(str2)) {
      System.out.println("s1.equals(str2) : Same value");
    }
    else {
      System.out.println("s1.equals(str2) : Different value"); // False: "hello" != "World"
    }
  }
}
