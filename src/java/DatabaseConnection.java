/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.sql.*;
public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            // Establish connection
            String url = "jdbc:mysql://localhost:3306/onlinestore";
            String username = "root";
            String password = ""; // If no password is set
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Print success message
            System.out.println("Connected to the database!");
            
            // Close connection
            conn.close();
        } catch (SQLException e) {
            // Handle any errors
            e.printStackTrace();
        }
    }
    
}
