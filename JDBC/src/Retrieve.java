import java.sql.*;

// Retrieve data from Database
public class Retrieve {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/DB_name";
        String username = "root";
        String password = "Password";

        // Query for data retrieve
        String query = "Select * from employee";

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
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
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
            rs.close();
            stmt.close();
            con.close();
            System.out.println("\n Connection closed successfully !!");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
