import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Admin@123";
        String query = "UPDATE employee SET salary = ? WHERE name = ? AND job_title = ?";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully");
            PreparedStatement preparedStatement = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter employee name to update: ");
            String name = sc.nextLine();
            System.out.print("Enter job title to confirm: ");
            String job = sc.nextLine();
            System.out.print("Enter new salary: ");
            Double salary = sc.nextDouble();

            preparedStatement.setDouble(1, salary);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, job);

            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                System.out.println("Update successful. " + rows + " rows affected.");
            } else {
                System.out.println("No rows updated - employee not found.");
            }

            sc.close();
            preparedStatement.close();
            con.close();
            System.out.println("\nConnection closed successfully!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
