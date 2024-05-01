import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminSigninServlet", urlPatterns = {"/AdminSigninServlet"})
public class AdminSigninServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlinestore";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection to MySQL database
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                // Create SQL query to check if username and password match
                String sql = "SELECT * FROM admin_requests WHERE username = ? AND password = ?";
                
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    
                    // Execute the query
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            // User authenticated, set session attribute and redirect to add_product.jsp
                            request.getSession().setAttribute("username", username);
                            response.sendRedirect("add_product.jsp");
                        } else {
                            // Invalid credentials, forward back to login page with error message
                            request.setAttribute("error", "Invalid username or password");
                            request.getRequestDispatcher("login.jsp").forward(request, response);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            // Handle database connection errors
            ex.printStackTrace(); // Log exception
            response.sendRedirect("error.jsp");
        }
    }
}
