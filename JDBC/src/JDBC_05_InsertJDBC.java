import java.sql.*;

public class JDBC_05_InsertJDBC {
    public static void main(String []args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/employeedata";
            String username = "root";
            String password = "charmingadnan17@gmail.com";
            Connection con = DriverManager.getConnection(url, username, password);

            // Create a Query
            String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // Create a StateMent
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in database..");

            //After everything runs than stop and exit so we use -> close() method
            con.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
