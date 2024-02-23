package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create_Connection {

    public static void main(String[] args) {

        // Create a new DB Connection
        String url = "jdbc:mysql://localhost:3306/testdata";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection cn = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Successfully!");
            cn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
