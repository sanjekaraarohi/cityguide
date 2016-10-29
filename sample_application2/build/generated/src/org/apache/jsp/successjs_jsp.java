package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class successjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/default.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"header-wrapper\">\n");
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
      out.write("\t\t\t\t<li><a href=\"index.jsp\" accesskey=\"5\" title=\"\">Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("        <div id=\"banner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <section class=\"register\">\n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("        function getOptions(city) {\n");
      out.write("\tvar list;\n");
      out.write("\tvar listValue;\n");
      out.write("\tif (city == \"Indore\") {\n");
      out.write("\t\tlist = new Array(\"Rajwada\",\"Khajrana\",\"Nehru Park\",\"Lalbag\",\"Regional Park\");\n");
      out.write("\t\tlistValue = new Array(\"Rajwada\",\"Khajrana\",\"Nehru Park\",\"Lalbag\",\"Regional Park\");\n");
      out.write("\t}\n");
      out.write("\tif (city == \"Mumbai\") {\n");
      out.write("\t\tlist = new Array(\"Bridgeport IPA\",\"Red Hook ESB\",\"Alaskan Amber\",\"Widmer Hefewiezen\");\n");
      out.write("\t\tlistValue = new Array(\"Bridgeport IPA\",\"Red Hook ESB\",\"Alaskan Amber\",\"Widmer Hefewiezen\");\n");
      out.write("\t}\n");
      out.write("\tif (city == \"Pune\") {\n");
      out.write("\t\tlist = new Array(\"Black Butte\",\"Pete's Wicked\",\"Guiness\");\n");
      out.write("\t\tlistValue = new Array(\"Black Butte\",\"Pete's Wicked\",\"Guiness\");\n");
      out.write("\t}\n");
      out.write("\t//for (var i = 0; i < document.OptionMaker.CityType.length; i++) { //Clear the 2nd menu\n");
      out.write("\t\t//document.OptionMaker.City.options[i] = null;\n");
      out.write("\t//}\n");
      out.write("\tfor (var i = 0; i < list.length; i++) { //Repopulate 2nd menu\n");
      out.write("\t\tdocument.OptionMaker.City.options[i] = new Option(list[i],listValue[i],0,0);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<title>Dynamic Options</title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<form name=\"OptionMaker\" action=\"Display\" method=\"post\">\n");
      out.write("    <h1><b>Welcome User!</b></h1>\n");
      out.write("                 <br>\n");
      out.write("  <p><select  name=\"CityType\" onchange=\"getOptions(this.value)\">\n");
      out.write("    <option value=\"Indore\">Indore</option>\n");
      out.write("    <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("    <option value=\"Pune\">Pune</option>\n");
      out.write("    \n");
      out.write("  </select>&nbsp;&nbsp;&nbsp;&nbsp; <select  name=\"City\">\n");
      out.write("      <input type=\"submit\"  value=\"Submit\"/>\n");
      out.write("  </select></p>\n");
      out.write("  </div>\n");
      out.write("             </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
