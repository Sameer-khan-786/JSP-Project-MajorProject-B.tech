/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2024-04-18 07:10:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1713424146707L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1713424146711L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"csss1.css\" />\n");
      out.write("\n");
      out.write("<title>ProxyReEncryption</title>\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"csss2.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<table align=\"left\">\n");
      out.write("	<tr>\n");
      out.write("		\n");
      out.write("	</tr>\n");
      out.write("	</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<font size=\"5\"><center><H2>Secure Cloud Storage with Proxy Re-Encryption System</H2></center></font>\n");
      out.write("\n");
      out.write("<div class=\"drop\">\n");
      out.write("\n");
      out.write("<center><ul class=\"drop_menu\">\n");
      out.write("<li class=\"\">\n");
      out.write("                        <a href=\"index.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"page-scroll\">\n");
      out.write("                        <a href=\"DataOwner.jsp\">Data Owner</a>\n");
      out.write("                    </li>\n");
      out.write("					<li class=\"page-scroll\">\n");
      out.write("                        <a href=\"User.jsp\">User</a>\n");
      out.write("                    </li>\n");
      out.write("					\n");
      out.write("                   \n");
      out.write("					<li class=\"page-scroll\">\n");
      out.write("                        <a href=\"login.jsp\">CSP</a>\n");
      out.write("								\n");
      out.write("									<!--<ul>\n");
      out.write("										<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("										<li><a href=\"register.jsp\">Registration</a></li>\n");
      out.write("								    </ul>-->\n");
      out.write("							\n");
      out.write("                    </li>\n");
      out.write("</ul>\n");
      out.write("</center></div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".footer-inner{\n");
      out.write("	background-color: grey;\n");
      out.write("	display: block;\n");
      out.write("	text-align:right;\n");
      out.write("}\n");
      out.write(".footer-ul{\n");
      out.write("	list-style-type: none;\n");
      out.write("	 margin: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write(".footer-ul li{\n");
      out.write("	display: inline;\n");
      out.write("	padding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<center><img src=\"img/arch1.png\" width=\"455\" height=\"450\" border=\"0\" alt=\"\">\n");
      out.write("<br><br>\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css1.css\" />\n");
      out.write("<title>S2B</title>\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css2.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".footer-inner{\n");
      out.write("	background-color: grey;\n");
      out.write("	display: block;\n");
      out.write("	text-align:right;\n");
      out.write("}\n");
      out.write(".footer-ul{\n");
      out.write("	list-style-type: none;\n");
      out.write("	 margin: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write(".footer-ul li{\n");
      out.write("	display: inline;\n");
      out.write("	padding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div class=\"footer\">\n");
      out.write("<div style=\"width:100%\" class=\"footer-inner\">\n");
      out.write("<ul class=\"footer-ul\">\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(' ');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
