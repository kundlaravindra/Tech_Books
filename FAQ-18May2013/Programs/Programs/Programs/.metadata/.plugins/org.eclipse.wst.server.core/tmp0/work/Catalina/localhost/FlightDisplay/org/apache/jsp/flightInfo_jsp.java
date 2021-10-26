package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class flightInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("function bigImg(x)\r\n");
      out.write("{\r\n");
      out.write("x.style.height=\"64px\";\r\n");
      out.write("x.style.width=\"64px\";\r\n");
      out.write("if(x.id == \"img\")\r\n");
      out.write("document.getElementById(\"flight\").style.visibility=\"visible\";\r\n");
      out.write("if(x.id == \"img1\")\r\n");
      out.write("document.getElementById(\"flight1\").style.visibility=\"visible\";\r\n");
      out.write("if(x.id == \"img2\")\r\n");
      out.write("document.getElementById(\"flight2\").style.visibility=\"visible\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function normalImg(x)\r\n");
      out.write("{\r\n");
      out.write("x.style.height=\"32px\";\r\n");
      out.write("x.style.width=\"22px\";\r\n");
      out.write("\r\n");
      out.write("setInterval(function(){\r\n");
      out.write("\t\tif(x.id == \"img\")\r\n");
      out.write("\t\tdocument.getElementById(\"flight\").style.visibility=\"hidden\";\r\n");
      out.write("\t\tif(x.id == \"img1\")\r\n");
      out.write("\t\tdocument.getElementById(\"flight1\").style.visibility=\"hidden\";\r\n");
      out.write("\t\tif(x.id == \"img2\")\r\n");
      out.write("\t\tdocument.getElementById(\"flight2\").style.visibility=\"hidden\";\r\n");
      out.write("\t},1000);\r\n");
      out.write("}\r\n");
      out.write("function openCal()\r\n");
      out.write("{\r\n");
      out.write("\twindow.open(\"my.jsp\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<label onmouseover=\"bigImg(this)\" id=\"img\" onmouseout=\"normalImg(this)\">FlightOne</label>\r\n");
      out.write("<!-- <img onmouseover=\"bigImg(this)\" id=\"img\" onmouseout=\"normalImg(this)\" border=\"0\" src=\"flight.bmp\" alt=\"FlightOne\" width=\"32\" height=\"32\" /></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"flight\" style='visibility:hidden;'>\r\n");
      out.write("<p><textarea rows=\"5\" cols=\"30\" style='visibility'>\r\n");
      out.write("Flihht from Delhi\r\n");
      out.write(" to Hyderabad time \r\n");
      out.write("  Morning 10 am\r\n");
      out.write("</textarea>\r\n");
      out.write("<a href=\"javascript:openCal()\">For More Info</a>\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img onmouseover=\"bigImg(this)\" id=\"img1\" onmouseout=\"normalImg(this)\" border=\"0\" src=\"flight.bmp\" alt=\"FlightTwo\" width=\"32\" height=\"32\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("<textarea id=\"flight1\" rows=\"5\" cols=\"30\" style='visibility:hidden;'>\r\n");
      out.write("Flihht from Delhi\r\n");
      out.write(" to Hyderabad time \r\n");
      out.write("Evening  4 pm\r\n");
      out.write("</textarea>\r\n");
      out.write("<a href=\"javascript:openCal()\">For More Info</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img onmouseover=\"bigImg(this)\" id=\"img2\" onmouseout=\"normalImg(this)\" border=\"0\" src=\"flightThree\" alt=\"FlightThree\" width=\"32\" height=\"32\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("<textarea id=\"flight2\" rows=\"5\" cols=\"30\" style='visibility:hidden;'>\r\n");
      out.write("Flihht from Delhi\r\n");
      out.write(" to Hyderabad time \r\n");
      out.write(" Night 8 pm</textarea>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
