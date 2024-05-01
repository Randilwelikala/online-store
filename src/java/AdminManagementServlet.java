import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/AdminManagementServlet"})
public class AdminManagementServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlinestore";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                String selectSql = "SELECT * FROM admin_requests";
                try (PreparedStatement selectStatement = connection.prepareStatement(selectSql)) {
                    ResultSet resultSet = selectStatement.executeQuery();
                    List<PendingRequest> pendingRequests = new ArrayList<>();
                    while (resultSet.next()) {
                        PendingRequest pendingRequest = new PendingRequest();
                        pendingRequest.setRequestId(resultSet.getInt("request_id"));
                        pendingRequest.setFullName(resultSet.getString("full_name"));
                        pendingRequest.setEmail(resultSet.getString("email"));
                        pendingRequest.setUsername(resultSet.getString("username"));
                        pendingRequests.add(pendingRequest);
                    }
                    request.setAttribute("pendingRequests", pendingRequests);
                    request.getRequestDispatcher("AdminRequests.jsp").forward(request, response);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            response.sendRedirect("AdminRequests.jsp?error=database_error");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        int requestId = Integer.parseInt(request.getParameter("requestId"));

        if (action.equals("accept")) {
            acceptRequest(requestId, response);
        } else if (action.equals("delete")) {
            deleteRequest(requestId, response);
        }
    }

    private void acceptRequest(int requestId, HttpServletResponse response) throws IOException {
        // Accept request logic
    }

    private void deleteRequest(int requestId, HttpServletResponse response) throws IOException {
        // Delete request logic
    }
}
