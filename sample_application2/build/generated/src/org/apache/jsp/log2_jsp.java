package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/default.css\">\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header-wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\">CITYGUIDE</a></h1>\n");
      out.write("\t\t</div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"current_page_item\"><a href=\"log2.jsp\" accesskey=\"1\" title=\"\">Login</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\" accesskey=\"2\" title=\"\">Home Page</a></li>\n");
      out.write("                                \n");
      out.write("\t\t\t\t<li><a href=\"aboutus.html\" accesskey=\"3\" title=\"\">About Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Register.html\" accesskey=\"4\" title=\"\">Registration</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" accesskey=\"5\" title=\"\">Contact Us</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("                \n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <form class=\"login\" action=\"LoginServlet\" method=\"post\" >\n");
      out.write("           \n");
      out.write("            <input type= \"text\" class=\"login-input\" name=\"username\" placeholder=\"username\"/>\n");
      out.write("            <input type= \"text\" class=\"login-input\" name=\"password\"placeholder=\"password\"/>\n");
      out.write("            <input type=\"submit\" class=\"login-submit\" value=\"login\"/>\n");
      out.write("            <p class=\"login-help\"><a href=\"\">forgetpassword</a></p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("            <div id=\"footer\" >\n");
      out.write("                      <p>&copy; Untitled. All rights reserved. Design by Aarohi Sanjekar <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>. Photos by <a href=\"http://fotogrph.com/\">Fotogrph</a>.</p>\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("        </body>\n");
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
