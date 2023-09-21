import java.io.*;
import java.sql.*;

public class JDBC_10_Changing_or_Updating_data_table {
    public static void main(String []args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");

            String q = "update table1 set tName=?, tCity=? where tId=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter new Name : ");
            String name = br.readLine();

            System.out.print("Enter new city : ");
            String city = br.readLine();

            System.out.print("Enter id : ");
            int id = Integer.parseInt(br.readLine());

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();
            System.out.println("Changes Successfully..");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}