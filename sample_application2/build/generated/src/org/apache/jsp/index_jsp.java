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
      out.write("    <div id=\"header-wrapper\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\">CITYGUIDE</a></h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"current_page_item\"><a href=\"#\" accesskey=\"1\" title=\"\">Homepage</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Register.html\" accesskey=\"2\" title=\"\">Registration</a></li>\n");
      out.write("                                \n");
      out.write("\t\t\t\t<li><a href=\"aboutus.html\" accesskey=\"3\" title=\"\">About Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"log2.jsp\" accesskey=\"4\" title=\"\">Login</a></li>\n");
      out.write("                                <li><a href =\"#\" accesskey=\"5\" title=\"\">contact</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\">\n");
      out.write("\t\t<div class=\"img-border\"> <a href=\"#\"><img src=\"images/IMP Logo.png\" width=\"200\" height=\"200\" alt=\"\" /></a> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"page-wrapper\">\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\n");
      out.write("                    <h2>Welcome to CITYGUIDE!</h2><br>\n");
      out.write("                                \n");
      out.write("                    <p>Piping hot and fresh out of the oven, TheCityGuide.in is a great way to discover indore city and find out valuable information about the place.<br> Thecityguide is launched  for providing a comprehensive online leisure and entertainment guide for the youthful, net-savvy enthusiasts, travelers, explorers, and of course, everyone else.</p><br>\n");
      out.write("                    <p>It brings together all information about places in town , recreational outlets and just about everything else. The idea is to let the information reach you in a neat, concise and useful format with a power of just a few clicks. It is filled to the rim with lot of brilliant features, all packed in a user friendly and nifty way.</p><br>\n");
      out.write("                    <p> It constantly tries to go all-out to ease your life bit by bit.<br> \n");
      out.write("                                \n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"footer\" class=\"container\">\n");
      out.write("\t<p>&copy; Untitled. All rights reserved. Design by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>. Photos by <a href=\"http://fotogrph.com/\">Fotogrph</a>.</p>\n");
      out.write("</div>\n");
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
