package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>FPT Bidding System</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"pop_up\" method=\"post\">\r\n");
      out.write("\t<h1>FPT Bidding System</h1>\r\n");
      out.write("\t\t<span style=\"padding-left:30px\"><input type=\"text\" name=\"firstname\" maxlength= 20 id=\"firName\" >&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"middlename\" maxlength= 20 id=\"midName\">&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"lastname\" maxlength= 20 id=\"lstName\" > &nbsp; <br>\r\n");
      out.write("\t\t\t<span style= \"padding-left: 30px\"><label for = \"fName\">First Name</label>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<label for = \"mName\" style=\"padding-left:100px\">Middle Name</label>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<label for = \"lName\" style=\"padding-left:80px\">Last Name</label> <br><br>\r\n");
      out.write("\t\t\t</span>\t\t\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t\t<span style= \"padding-left:30px\">\r\n");
      out.write("\t\t\t<label for=\"eAd\">Email Address:</label><br>\r\n");
      out.write("\t\t\t<span style = \"padding-left:30px\"><input type=\"text\" name=\"emailAd\" maxlength=20 size= 50></span><br><br>\r\n");
      out.write("\t\t\t<label for= \"username2\" style = \"padding-left:30px\">Username: </label><input type=\"text\" name=\"username2\" maxlength= 20 id= \"uName2\"><br><br>\r\n");
      out.write("  \t\t\t<label for= \"password2\" style = \"padding-left:30px\">Password: </label><input type=\"password\" name=\"password2\" maxlength= 20 id=\"uPword2\"><br><br>\r\n");
      out.write("\t\t\t<label for =\"verifyPassword\" style = \"padding-left:30px\"> Verify Password:</label> <input type=\"password\" name=\"vPassword\" maxlength= 20><br><br>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t<span style= \"padding-left:150px\"><input type=\"submit\"></span>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
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
