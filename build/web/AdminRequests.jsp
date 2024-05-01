<%@ page import="java.PendingRequest" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Requests Page</title>
    </head>
    <body>
        <h2>Pending Admin Requests</h2>
        <table border="1">
            <tr>
                <th>Full Name</th>
                <th>Email</th>
                <th>Username</th>
                <th>Action</th>
            </tr>
            <% List<PendingRequest> pendingRequests = (List<PendingRequest>) request.getAttribute("pendingRequests");
            for (PendingRequest pendingRequest : pendingRequests) {
            %>
            <tr>
                <td><%= pendingRequest.getFullName() %></td>
                <td><%= pendingRequest.getEmail() %></td>
                <td><%= pendingRequest.getUsername() %></td>
                <td>
                    <form action="AdminManagementServlet" method="post">
                        <input type="hidden" name="action" value="accept">
                        <input type="hidden" name="requestId" value="<%= pendingRequest.getRequestId() %>">
                        <button type="submit">Accept</button>
                    </form>
                    <form action="AdminManagementServlet" method="post">
                        <input type="hidden" name="action" value="delete">
                        <input type="hidden" name="requestId" value="<%= pendingRequest.getRequestId() %>">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
            <% } %>
        </table>
    </body>
</html>
