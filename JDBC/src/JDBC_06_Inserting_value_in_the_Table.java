import java.sql.*;

public class JDBC_06_Inserting_value_in_the_Table {
    public static void main(String []args) {
        try {
            // load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create a connection
            String url = "jdbc:mysql://localhost:3306/employeedata";
            String username = "root";
            String password = "charmingadnan17@gmail.com";

            Connection con = DriverManager.getConnection(url, username, password);

            //create a query : insert
            String q = "insert into table1(tName, tCity) values(?, ?)";

            // create a prepare statement: is used to insert values in to the table
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1,"Adnan");
            pstmt.setString(2,"Chennai");
            pstmt.setString(1,"Farhan");
            pstmt.setString(2,"Chennai");

            System.out.println("Data Inserted");
            // In statement only we put query in the executeupdate() method
            pstmt.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
