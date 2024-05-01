package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\n");
      out.write("    <title>shop</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .top_bar {\n");
      out.write("            background: #003D29;\n");
      out.write("            width: 100vw;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            color: white;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .top_bar > .second {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 10px;\n");
      out.write("        }\n");
      out.write("        .main {\n");
      out.write("            padding: 40px 80px;\n");
      out.write("        }\n");
      out.write("        .body_navbar {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("        .navitem_list {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .navitem_list p {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 5px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            background: black;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        .pink-box {\n");
      out.write("            background-color: pink;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            height: 100vh;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("        }\n");
      out.write("        .text-between {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            font-size: 24px;\n");
      out.write("            font-weight: 900;\n");
      out.write("            color: brown;\n");
      out.write("        }\n");
      out.write("        .products {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: 20% 20% 20% 20%;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .product {\n");
      out.write("            border: 1px solid black;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px;\n");
      out.write("            background: pink;\n");
      out.write("            height: 250px;\n");
      out.write("        }\n");
      out.write("        .ads {\n");
      out.write("            background: #FFF455;\n");
      out.write("            height: 30vh;\n");
      out.write("            margin-top: 30px;\n");
      out.write("            border-radius: 14px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            padding: 50px;\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        .adsimage {\n");
      out.write("            height: 30vh;\n");
      out.write("            width: 20vw;\n");
      out.write("            animation: imageSlide 3s infinite alternate;\n");
      out.write("        }\n");
      out.write("        @keyframes imageSlide {\n");
      out.write("            0% {\n");
      out.write("                transform: translateX(-50%);\n");
      out.write("            }\n");
      out.write("            100% {\n");
      out.write("                transform: translateX(50%);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"top_bar\">\n");
      out.write("        <div>0771243316</div>\n");
      out.write("        <div class=\"second\">\n");
      out.write("            <p>Eng</p>\n");
      out.write("            <p>Country</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"body_navbar\">\n");
      out.write("            <div><input type=\"text\" placeholder=\"search...\"></div>\n");
      out.write("            <div class=\"navitem_list\">\n");
      out.write("                <p><span class=\"material-symbols-outlined\">shopping_cart</span> Cart</p>\n");
      out.write("                <p><span class=\"material-symbols-outlined\">inventory</span> Order</p>\n");
      out.write("                <p><span class=\"material-symbols-outlined\">person</span> Accounts</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ads\">\n");
      out.write("            <div>\n");
      out.write("                <h1>Grab up to 20% off <br>Limited items</h1>\n");
      out.write("                <button>Buy Now</button>\n");
      out.write("            </div> \n");
      out.write("            <div>\n");
      out.write("                <img class=\"adsimage\" src=\"https://www.edataindia.com/wp-content/uploads/2021/08/ecommerce-1.png\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"text-between\">Computers</div>\n");
      out.write("        <div class=\"products\">\n");
      out.write("           <c:forEach var=\"oneproduct\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allproduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    <div class=\"product\">\n");
      out.write("        <h2><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oneproduct.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></h2>  \n");
      out.write("        <h2><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oneproduct.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></h2>  \n");
      out.write("    </div>   \n");
      out.write("</c:forEach>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
