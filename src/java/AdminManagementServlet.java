/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import java.io.PrintWriter;

/**
 *
 * @author Acer
 */
@WebServlet(urlPatterns = {"/AdminManagementServlet"})
public class AdminManagementServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlinestore";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminManagementServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminManagementServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String action = request.getParameter("action");
        int requestId = Integer.parseInt(request.getParameter("requestId"));

        if (action.equals("accept")) {
            acceptRequest(requestId, response);
        } else if (action.equals("delete")) {
            deleteRequest(requestId, response);
        }
    }

    private void acceptRequest(int requestId, HttpServletResponse response) throws IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                // Get admin request details
                String selectSql = "SELECT * FROM admin_requests WHERE request_id = ?";
                try (PreparedStatement selectStatement = connection.prepareStatement(selectSql)) {
                    selectStatement.setInt(1, requestId);
                    ResultSet resultSet = selectStatement.executeQuery();
                    if (resultSet.next()) {
                        // Move request to admins table
                        String insertSql = "INSERT INTO admins (full_name, email, password, username) "
                                + "VALUES (?, ?, ?, ?)";
                        try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                            insertStatement.setString(1, resultSet.getString("full_name"));
                            insertStatement.setString(2, resultSet.getString("email"));
                            insertStatement.setString(3, resultSet.getString("password"));
                            insertStatement.setString(4, resultSet.getString("username"));
                            int rowsInserted = insertStatement.executeUpdate();
                            if (rowsInserted > 0) {
                                // Delete request from admin_requests table
                                String deleteSql = "DELETE FROM admin_requests WHERE request_id = ?";
                                try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {
                                    deleteStatement.setInt(1, requestId);
                                    deleteStatement.executeUpdate();
                                    response.sendRedirect("AdminConfirm.jsp");
                                }
                            } else {
                                response.sendRedirect("signup.jsp?error=signup_failed");
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            response.sendRedirect("signup.jsp?error=database_error");
        }
    }

    private void deleteRequest(int requestId, HttpServletResponse response) throws IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                String deleteSql = "DELETE FROM admin_requests WHERE request_id = ?";
                try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {
                    deleteStatement.setInt(1, requestId);
                    deleteStatement.executeUpdate();
                    response.sendRedirect("AdminRequests.jsp");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            response.sendRedirect("AdminRequests.jsp?error=database_error");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
