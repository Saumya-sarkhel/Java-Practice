import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Insert data into Database manually
public class Insert {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Password";

        // Query for data insertion
        String query = "insert into employee(ID, name, job_title, salary) VALUES (4, 'Hritesh', 'IOS Developer', 43000.0);";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully");
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);

            if (rows > 0){
                System.out.println("Insert successfull. " + rows + " rows affected.");
            }else {
                System.out.println("Insertion failed.");
            }

            stmt.close();
            con.close();
            System.out.println("\n Connection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
