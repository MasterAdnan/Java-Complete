import java.sql.*;

public class JDBC_11_Selecting_Data {
    public static void main(String[]args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");

            String Query = "select * from table1";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(Query);

            while(set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);

//                System.out.println("Id : " + id + " | Name : " + name + " | City : " + city);
                System.out.println(id + ". " + name + ", " + city);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
