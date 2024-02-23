package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_Data {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdata";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection cn = DriverManager.getConnection(url, username, password);

            String s = "Delete from student where id = 1";
            PreparedStatement p = null;

            p = cn.prepareStatement(s);
            p.execute();
            
            System.out.println("Data Deleted Successfully!");

            cn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
