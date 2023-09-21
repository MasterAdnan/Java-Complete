import java.net.ConnectException;
import java.sql.*;

public class JDBC_04 {
    public static void main(String[] args) {
        try{
            // Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection
//            String url = "jdbc:mysql://localhost:3306/mysql";
//            String username = "root";
//            String password = "charmingadnan17@gmail.com";
            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            String password = "charmingadnan17@gmail.com";

            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()) {
                System.out.println("Connection is closed");
            }
            else {
                System.out.println("connection is created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
