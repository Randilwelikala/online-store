import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SuperAdminLogin")
public class SuperAdminLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if username and password match the expected values
        if ("randil".equals(username) && "randilrandil".equals(password)) {
            // If credentials are correct, redirect to SuperAdminInterface.jsp
            response.sendRedirect("SuperAdminInterface.jsp");
        } else {
            // If credentials are incorrect, redirect back to login page with error message
            response.sendRedirect("LogingAsSuperAdmin.jsp?error=invalid_credentials");
        }
    }
}
