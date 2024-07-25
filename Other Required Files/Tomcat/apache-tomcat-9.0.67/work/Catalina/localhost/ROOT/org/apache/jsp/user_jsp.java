/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2024-04-24 23:06:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("  <title>Proxy Encryption</title>\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|Raleway:300,400,500,600,700|Poppins:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("    html, body {\n");
      out.write("      height: 100%;\n");
      out.write("      margin: 0;\n");
      out.write("      background-color: lightyellow;\n");
      out.write("    }\n");
      out.write("    #hero {\n");
      out.write("      display: flex;\n");
      out.write("      align-items: center;\n");
      out.write("      justify-content: center;\n");
      out.write("      height: 100vh;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("    #footer {\n");
      out.write("      text-align: center;\n");
      out.write("      color: purple;\n");
      out.write("      background-color: lightblue;\n");
      out.write("    }\n");
      out.write("    .form-box {\n");
      out.write("      border: 1px solid #0dcaf0;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <header id=\"header\" class=\"fixed-top d-flex align-items-center\" style=\"background-color: lightblue\">\n");
      out.write("    <div class=\"container d-flex justify-content-between\">\n");
      out.write("      <h1 class=\"logo\"><a href=\"index.html\">Proxy<span style=\"color:purple;\">Re-Encryption</span></a></h1>\n");
      out.write("      <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"nav-link\" href=\"index.html\">Home</a></li>\n");
      out.write("          <li><a class=\"nav-link\" href=\"owner.jsp\">Data Owner</a></li>\n");
      out.write("          <li><a class=\"nav-link active\" href=\"user.jsp\">Data Users</a></li>\n");
      out.write("          \n");
      out.write("          <li><a class=\"nav-link\" href=\"cloud.jsp\">Proxy Server</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- Hero Section -->\n");
      out.write("  <section id=\"hero\">\n");
      out.write("    <div class=\"form-box\">\n");
      out.write("      <h2 style=\"color:#3498db;\">User Login Page</h2>\n");
      out.write("      <form action=\"uloginc.jsp\">\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("          <label for=\"username\" class=\"form-label\"><strong>Username</strong></label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"username\" name=\"user\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("          <label for=\"password\" class=\"form-label\"><strong>Password</strong></label>\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"password\" name=\"pass\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("        <a href=\"ureg.jsp\" style=\"color: #0dcaf0;\">New User</a>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p>Copyright © 2024_SameerKhan</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
