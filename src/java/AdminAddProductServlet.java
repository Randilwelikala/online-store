import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminAddProductServlet", urlPatterns = {"/AdminAddProductServlet"})
public class AdminAddProductServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlinestore";
    private static final String DB_USER = "root"; // Your database username
    private static final String DB_PASSWORD = ""; // Your database password

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
        String category = request.getParameter("category");
        int stockQuantity = Integer.parseInt(request.getParameter("stockQuantity"));
        String warrantyPeriod = request.getParameter("warrantyPeriod");

        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO products (name, description, price, category, stock_quantity, warranty_period) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setString(2, description);
                stmt.setBigDecimal(3, price);
                stmt.setString(4, category);
                stmt.setInt(5, stockQuantity);
                stmt.setString(6, warrantyPeriod);
                stmt.executeUpdate();
            }
            response.sendRedirect("product_added_success.jsp"); // Redirect to success page
        } catch (SQLException ex) {
            ex.printStackTrace();
            response.sendRedirect("add_product.jsp?error=Product addition failed. Please try again."); // Redirect to add product page with error message
        }
    }
}
