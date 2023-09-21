//package JDBC_09;
//
//import java.sql.*;
//public class ConnectionProvider {
//    private static Connection con;
//    public static Connection getConnection() {
//        try {
//            if(con == null) {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");
//            }
//        } catch (Exception e) {
//            System.out.println("null");
//        }
//        return con;
//    }
//}