package JDBC_12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Helper {
    public static void main(String[] args) {

        public static ImageIcon getImageIconById ( int id, Connection con){
            ImageIcon icon = null;

            try {

                Connection con = DriverManager.getConnection("mysql:jdba://localhost:3306/employeedata", "root", "charmingadnan17@gmail.com");
                String q = "select pic from newimage where id=?";

                PreparedStatement pstmt = con.prepareStatement(q);

                pstmt.setInt(1, id);

                ResultSet set = pstmt.executeQuery(q);

                if (set.next()) {
                    Blob b = set.getBlob("pic");
                    InputStream is = b.getBinaryStream();

                    Image img = ImageIO.read(is);
                    ImageIcon ii = new imageIcon(image);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return icon;

        }
    }

    private static class Connection {
    }
}


