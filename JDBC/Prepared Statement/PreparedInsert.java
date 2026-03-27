import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Admin@123";
        String query = "INSERT INTO employee(name, job_title, salary) VALUES(?, ?, ?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully");
            PreparedStatement preparedStatement = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the employee: ");
            String name = sc.nextLine();
            System.out.print("Enter the job title: ");
            String job = sc.nextLine();
            System.out.print("Enter the salary: ");
            Double salary = sc.nextDouble();

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, job);
            preparedStatement.setDouble(3, salary);

            int rows = preparedStatement.executeUpdate();
            if (rows > 0){
                System.out.println("Insert successfull. " + rows + " rows affected.");
            }else {
                System.out.println("Insertion failed.");
            }

            sc.close();
            preparedStatement.close();
            con.close();
            System.out.println("\n Connection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
