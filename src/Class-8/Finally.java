
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Finally {
    public static void main(String[] args) throws NumberFormatException, IOException{

        int num;
        BufferedReader br = null;

        try {
            // create a new BufferedReader to read from the InputStreamReader
            br = new BufferedReader(new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }
        finally {
            br.close(); //finally used to close the resources  regardless Excpetion occur or not
            System.out.println("End of code.");
        }
    }
}
