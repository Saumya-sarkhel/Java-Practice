import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Update records in database
public class Update {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Password";

        // Query for data retrieve
        String query = "UPDATE employee\n" +
                "set job_title = 'Full stack developer', salary = 50000.0\n" +
                "where id = 2; ";
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
                System.out.println("Update successfull. " + rows + " rows affected.");
            }else {
                System.out.println("Update failed.");
            }

            stmt.close();
            con.close();
            System.out.println("\nConnection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
