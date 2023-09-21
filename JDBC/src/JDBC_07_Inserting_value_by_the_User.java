import java.sql.*;
import java.io.*;


public class JDBC_07_Inserting_value_by_the_User {
    public static void main(String []args) {

        try{
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create a connection
            String url = "jdbc:mysql://localhost:3306/employeedata";
            String username = "root";
            String password = "charmingadnan17@gmail.com";

            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q = "insert into table1(tName, tCity) values (?, ?)";

            //create a preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            //create a buffer : because input getting by the user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Name : ");
            String name = br.readLine();

            System.out.print("Enter City : ");
            String city = br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            System.out.println("Data inserted by the user");

            pstmt.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
