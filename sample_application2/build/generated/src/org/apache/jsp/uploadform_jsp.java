package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("      <title>Image Upload</title>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"FileUploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("    <table width=\"400px\" align=\"center\" border=0>\n");
      out.write("       <tr>\n");
      out.write("           <td align=\"center\" colspan=2>\n");
      out.write("            Image Details</td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td>First Name </td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"input\" name=\"firstname\">\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td>Last Name </td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"input\" name=\"lastname\">\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td>Image Link: </td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"file\" name=\"file\">\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td></td>\n");
      out.write("           <td>\n");
      out.write("              <input type=\"submit\" name=\"submit\" value=\"Submit\"></td>\n");
      out.write("       </tr>\n");
      out.write("   </table>\n");
      out.write("</form>\n");
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
