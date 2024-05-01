import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpAsUser")
public class SignUpAsUser extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_database_username";
    private static final String DB_PASSWORD = "your_database_password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form parameters
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        // Validate form data (you can add more validation if needed)
        if (fullName == null || email == null || password == null || username == null || dob == null || address == null) {
            response.sendRedirect("signup.jsp?error=missing_fields");
            return;
        }

        // Perform database operation to insert user data
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            String insertQuery = "INSERT INTO users (full_name, email, password, username, dob, address, phone) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, dob);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, phone);
            preparedStatement.executeUpdate();
            connection.close();

            // Redirect to dashboard.jsp upon successful signup
            response.sendRedirect("dashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("signup.jsp?error=database_error");
        }
    }
}
