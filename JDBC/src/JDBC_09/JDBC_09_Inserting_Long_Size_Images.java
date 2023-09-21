package JDBC_09;

import java.sql.*;
import javax.swing.*;
import java.io.*;

public class JDBC_09_Inserting_Long_Size_Images {

    public static void main(String []args) {

        try{
//            Connection c = ConnectionProvider.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");

            String q = "insert into newimage(pic) values (?)";

            PreparedStatement pstmt = c.prepareStatement(q);
            ////
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            ////
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();

//            System.out.println("Images Inserted");
            //  OR
            JOptionPane.showMessageDialog(null, "Images Inserted");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}