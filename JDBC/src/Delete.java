import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Delete data from DB
public class Delete {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Passworrd";

        // Query for data Deletion
        String query = "Delete from employee where id = 4;";
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
                System.out.println("Deletion successfull. " + rows + " rows affected.");
            }else {
                System.out.println("Deletion failed.");
            }

            stmt.close();
            con.close();
            System.out.println("\nConnection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
