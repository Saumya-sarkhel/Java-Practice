public class cmdline {
  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Warning: Enter Command line argument of two string.");
    }
    else{
      System.out.println("Your Name: " + args[0] + " " + args[1]);
    }
  }
}
