/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2024-07-25 12:27:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Com.CodeWithSameer.Dao.UserDao;
import Com.CodeWithSameer.Dao.LikeDao;
import Com.CodeWithSameer.Entities.User;
import Com.CodeWithSameer.Entities.Post;
import java.util.List;
import Com.CodeWithSameer.Helper.ConnectionProvider;
import Com.CodeWithSameer.Dao.PostDao;

public final class load_005fposts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Com.CodeWithSameer.Entities.Post");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Com.CodeWithSameer.Dao.PostDao");
    _jspx_imports_classes.add("Com.CodeWithSameer.Dao.UserDao");
    _jspx_imports_classes.add("Com.CodeWithSameer.Helper.ConnectionProvider");
    _jspx_imports_classes.add("Com.CodeWithSameer.Entities.User");
    _jspx_imports_classes.add("Com.CodeWithSameer.Dao.LikeDao");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("    ");

            String userEmail = request.getParameter("userEmail");
            String userPassword = request.getParameter("userPassword");
           
        UserDao userDAO = new UserDao(ConnectionProvider.getConnection()); User uuu = new User(); uuu = userDAO.getUserByUserId((int) session.getAttribute("user_id")); 
        
        Thread.sleep(400);
        PostDao d = new PostDao(ConnectionProvider.getConnection());
        
        int cid = Integer.parseInt(request.getParameter("cid"));
        List<Post> posts = null;
        if (cid == 0) {
            posts = d.getAllPosts();
        } else {
            posts = d.getPostByCatId(cid);
        }
        
        if (posts.size() == 0) {
            out.println("<h3 class='display-3 text-center'>No Posts in this category..</h3>");
            return;
        }
        
        for (Post p : posts) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-md-6 mt-2\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img class=\"card-img-top\" src=\"blog_pics/");
      out.print( p.getpPic());
      out.write("\" alt=\"Card image cap\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <b>");
      out.print( p.getpTitle());
      out.write("</b>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer nav-bac text-center\">\n");
      out.write("                ");
 
                    LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
                
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"#!\" onclick=\"doLike(");
      out.print( p.getPid());
      out.write(',');
      out.print( uuu.getId());
      out.write(")\" class=\"btn btn-outline-light btn-sm\"> <i class=\"fa fa-thumbs-o-up\"></i> <span class=\"like-counter\">");
      out.print( ld.countLikeOnPost(p.getPid()));
      out.write("</span>  </a>\n");
      out.write("\n");
      out.write("                <a href=\"show_blog_page.jsp?post_id=");
      out.print( p.getPid());
      out.write("\" class=\"btn btn-outline-light btn-sm\">Read More...</a>\n");
      out.write("                <a href=\"#!\" class=\"btn btn-outline-light btn-sm\"> <i class=\"fa fa-commenting-o\"></i> <span>20</span>  </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        }
        

    
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
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
