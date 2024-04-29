package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUpAsAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Signup Page</title>\n");
      out.write("        <script>\n");
      out.write("            function validationForm(){\n");
      out.write("                var fullName = document.getElementById(\"fullName\").value.trim();\n");
      out.write("                var email = document.getElementById(\"email\").value.trim();\n");
      out.write("                var password = document.getElementById(\"password\").value.trim();\n");
      out.write("                var username = document.getElementById(\"username\").value.trim();\n");
      out.write("                var dob = document.getElementById(\"dob\").value.trim();\n");
      out.write("                var address = document.getElementById(\"address\").value.trim();\n");
      out.write("                var phone = document.getElementById(\"phone\").value.trim();\n");
      out.write("                var termsChecked = document.getElementById(\"terms\").checked;\n");
      out.write("                var adminRequest = document.getElementById(\"adminRequest\").checked;\n");
      out.write("                // Validate full name\n");
      out.write("                if (fullName === \"\") {\n");
      out.write("                    alert(\"Please enter your full name.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate email format\n");
      out.write("                var emailPattern = /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/;\n");
      out.write("                if (!emailPattern.test(email)) {\n");
      out.write("                    alert(\"Please enter a valid email address.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate password length\n");
      out.write("                if (password.length < 8) {\n");
      out.write("                    alert(\"Password must be at least 8 characters long.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate username\n");
      out.write("                if (username === \"\") {\n");
      out.write("                    alert(\"Please enter a username.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate date of birth\n");
      out.write("                if (dob === \"\") {\n");
      out.write("                    alert(\"Please enter your date of birth.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate shipping address\n");
      out.write("                if (address === \"\") {\n");
      out.write("                    alert(\"Please enter your shipping address.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate phone number (optional)\n");
      out.write("                if (phone !== \"\" && !/^\\d{10}$/.test(phone)) {\n");
      out.write("                    alert(\"Please enter a valid 10-digit phone number.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Check if terms checkbox is checked\n");
      out.write("                if (!termsChecked) {\n");
      out.write("                    alert(\"Please agree to the Terms of Service and Privacy Policy.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true; // Form is valid\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body>\n");
      out.write("    <h2>Admin Signup</h2>\n");
      out.write("    <form action=\"AdminSignupServlet\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("        <label for=\"fullName\">Full Name:</label>\n");
      out.write("        <input type=\"text\" id=\"fullName\" name=\"fullName\" required><br>\n");
      out.write("\n");
      out.write("        <label for=\"email\">Email Address:</label>\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" required><br>\n");
      out.write("\n");
      out.write("        <label for=\"password\">Password:</label>\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"password\" required><br>\n");
      out.write("\n");
      out.write("        <label for=\"username\">Username:</label>\n");
      out.write("        <input type=\"text\" id=\"username\" name=\"username\" required><br>\n");
      out.write("\n");
      out.write("        <label for=\"dob\">Date of Birth:</label>\n");
      out.write("        <input type=\"date\" id=\"dob\" name=\"dob\" required><br>\n");
      out.write("\n");
      out.write("        <label for=\"address\">Shipping Address:</label>\n");
      out.write("        <textarea id=\"address\" name=\"address\" rows=\"4\" cols=\"50\" required></textarea><br>\n");
      out.write("\n");
      out.write("        <label for=\"phone\">Phone Number:</label>\n");
      out.write("        <input type=\"tel\" id=\"phone\" name=\"phone\" pattern=\"[0-9]{10}\"><br>\n");
      out.write("\n");
      out.write("        <input type=\"checkbox\" id=\"terms\" name=\"terms\" required>\n");
      out.write("        <label for=\"terms\">I agree to the Terms of Service and Privacy Policy</label><br>\n");
      out.write("        \n");
      out.write("        <button type=\"submit\">Signup</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
