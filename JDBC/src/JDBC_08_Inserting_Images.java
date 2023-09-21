import java.io.FileInputStream;
import java.sql.*;

public class JDBC_08_Inserting_Images {
    public static void main(String []args) {
        try {
            // Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");

            //create a query
            String q = "insert into newimage(pic) values (?)";

            //create a object by prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);

            // -->> in the text value we write like this
            //pstmt.setString(1, "value");
            // BUt in here we store image , like this

            FileInputStream fis = new FileInputStream("C:\\Users\\charm\\OneDrive\\Desktop\\JDBC_01_compress.jpg");
            pstmt.setBinaryStream(1, fis);

            System.out.println("Image Inserted Successfully");
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
