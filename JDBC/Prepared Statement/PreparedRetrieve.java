import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedRetrieve {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Admin@123";
        String query = "Select * from employee where name = ? AND job_title = ?";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully");
            PreparedStatement preparedStatement = con.prepareStatement(query);

            System.out.print("Enter the name of the employee: ");
            String name1 = sc.nextLine();
            System.out.print("Enter the job title: ");
            String job1 = sc.nextLine();

            preparedStatement.setString(1, name1);
            preparedStatement.setString(2, job1);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println();
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Job Title : " + job_title);
                System.out.println("Salary : " + salary);
            }

            sc.close();
            rs.close();
            preparedStatement.close();
            con.close();
            System.out.println("\n Connection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
