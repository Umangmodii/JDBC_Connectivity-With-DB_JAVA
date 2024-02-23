package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inserted_Data {

    public static void main(String[] args) {

        // Create a new DB Connection
        String url = "jdbc:mysql://localhost:3306/testdata";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection cn = DriverManager.getConnection(url, username, password);

            String data = "insert into student(id,name) values(?,?)";

            // Prepared Statement get Objects
            PreparedStatement ps = cn.prepareStatement(data);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the Id : ");
            String id = br.readLine();

            System.out.print("Enter the Name : ");
            String name = br.readLine();

            // Set the Values to Query
            ps.setString(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Data Inserted...");

            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
