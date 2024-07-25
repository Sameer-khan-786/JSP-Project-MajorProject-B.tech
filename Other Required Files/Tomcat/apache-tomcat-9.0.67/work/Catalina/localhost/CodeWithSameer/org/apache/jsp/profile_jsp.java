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
import Com.CodeWithSameer.Entities.Category;
import java.util.ArrayList;
import Com.CodeWithSameer.Helper.ConnectionProvider;
import Com.CodeWithSameer.Dao.PostDao;
import Com.CodeWithSameer.Entities.Message;
import Com.CodeWithSameer.Entities.User;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("Com.CodeWithSameer.Dao.PostDao");
    _jspx_imports_classes.add("Com.CodeWithSameer.Entities.Message");
    _jspx_imports_classes.add("Com.CodeWithSameer.Dao.UserDao");
    _jspx_imports_classes.add("Com.CodeWithSameer.Helper.ConnectionProvider");
    _jspx_imports_classes.add("Com.CodeWithSameer.Entities.Category");
    _jspx_imports_classes.add("Com.CodeWithSameer.Entities.User");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
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


            String userEmail = request.getParameter("userEmail");
            String userPassword = request.getParameter("userPassword");
           
    if (session == null || session.getAttribute("user_id") == null) {
		response.sendRedirect("login_page.jsp");
	}
    


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CHAT BOX || by Sameer</title>\n");
      out.write("         <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background-color: #d7ccc8;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .primary-backgroung\n");
      out.write("{\n");
      out.write("    background-color: #5e35b1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--nav bar start-->\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark\" style=\"background-color: #311b92;\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"profile.jsp\"><span class=\"fa fa-desktop\"></span> CHATTING HUB </a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"profile.jsp\"><span class=\"fa fa-home\"></span> Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("         <span class=\"fa fa-navicon\"></span> Categories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a href=\"#\" onclick=\"getPosts(0, this)\"  class=\" c-link list-group-item list-group-item-action active\">\n");
      out.write("                                All Posts\n");
      out.write("                            </a>\n");
      out.write("                            <!--categories-->\n");
      out.write("\n");
      out.write("                            ");
                                PostDao d1 = new PostDao(ConnectionProvider.getConnection());
                                ArrayList<Category> list2 = d1.getAllCategories();
                                for (Category cc : list2) {

                            
      out.write("\n");
      out.write("                            <a href=\"#\" onclick=\"getPosts(");
      out.print( cc.getCid());
      out.write(", this)\" class=\" c-link list-group-item list-group-item-action\">");
      out.print( cc.getName());
      out.write("</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
                                        }

                            
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"contactus.jsp\"><span class=\"fa fa-address-book-o\"></span> Contact</a>\n");
      out.write("      </li>\n");
      out.write("      </li>\n");
      out.write("       \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/message?userEmail=");
      out.print( userEmail);
      out.write("&userPassword=");
      out.print( userPassword );
      out.write("\"><span class=\"fa fa-comments-o\"></span> Message</a>\n");
      out.write("      </li>\n");
      out.write("       \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#add-post-modal\" > <span class=\"	fa fa-pencil-square-o\"></span> Post</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav mr-right\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"> <span class=\"fa fa-user-circle \"></span>");
 UserDao userDAO = new UserDao(ConnectionProvider.getConnection()); User us = new User(); us = userDAO.getUserByUserId((int) session.getAttribute("user_id")); 
      out.write(' ');
      out.print( us.getName());
      out.write(" </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"LogoutServlet\"> <span class=\"fa fa-user-plus \"></span> Logout</a>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--end of nav bar-->\n");
      out.write("        \n");
      out.write("        ");

            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert ");
      out.print( m.getCssClass());
      out.write("\" role=\"alert\">\n");
      out.write("            ");
      out.print( m.getContent());
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                session.removeAttribute("msg");
            }

        
      out.write("\n");
      out.write("        \n");
      out.write("        <!--main body of the page-->\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row mt-4\">\n");
      out.write("                    <!--first col-->\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <!--categories-->\n");
      out.write("                        <div class=\"list-group\">\n");
      out.write("                            <a href=\"#\" onclick=\"getPosts(0, this)\"  class=\" c-link list-group-item list-group-item-action active\">\n");
      out.write("                                All Posts\n");
      out.write("                            </a>\n");
      out.write("                            <!--categories-->\n");
      out.write("\n");
      out.write("                            ");
                                PostDao d = new PostDao(ConnectionProvider.getConnection());
                                ArrayList<Category> list1 = d.getAllCategories();
                                for (Category cc : list1) {

                            
      out.write("\n");
      out.write("                            <a href=\"#\" onclick=\"getPosts(");
      out.print( cc.getCid());
      out.write(", this)\" class=\" c-link list-group-item list-group-item-action\">");
      out.print( cc.getName());
      out.write("</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
                                        }

                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--second col-->\n");
      out.write("                    <div class=\"col-md-8\" >\n");
      out.write("                        <!--posts-->\n");
      out.write("                        <div class=\"container text-center\" id=\"loader\">\n");
      out.write("                            <i class=\"fa fa-refresh fa-4x fa-spin\"></i>\n");
      out.write("                            <h3 class=\"mt-2\">Loading...</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container-fluid\" id=\"post-container\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--end main body of the page-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--start of profile modal - display profile details-->\n");
      out.write("        \n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header primary-backgroung text-white text-center\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\"> CHATTING HUB </h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"container text-center\">\n");
      out.write("                            <img src=\"pics/");
      out.print( us.getProfile());
      out.write("\" class=\"img-fluid\" style=\"border-radius:50%;max-width: 150px;;\" >\n");
      out.write("                            <br>\n");
      out.write("                            <h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\"> ");
      out.print( us.getName());
      out.write(" </h5>\n");
      out.write("                            <!--//details-->\n");
      out.write("\n");
      out.write("                            <div id=\"profile-details\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\"> ID :</th>\n");
      out.write("                                            <td> ");
      out.print( us.getId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\"> Email : </th>\n");
      out.write("                                            <td>");
      out.print( us.getEmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Gender :</th>\n");
      out.write("                                            <td>");
      out.print( us.getGender());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Status :</th>\n");
      out.write("                                            <td>");
      out.print( us.getAbout());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Registered on :</th>\n");
      out.write("                                            <td>");
      out.print( us.getDateTime().toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--profile edit-->\n");
      out.write("\n");
      out.write("                            <div id=\"profile-edit\" style=\"display: none;\">\n");
      out.write("                                <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("                                <form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>ID :</td>\n");
      out.write("                                            <td>");
      out.print( us.getId());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Email :</td>\n");
      out.write("                                            <td> <input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print( us.getEmail());
      out.write("\" > </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Name :</td>\n");
      out.write("                                            <td> <input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print( us.getName());
      out.write("\" > </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Password :</td>\n");
      out.write("                                            <td> <input type=\"password\" class=\"form-control\" name=\"user_password\" value=\"");
      out.print( us.getPassword());
      out.write("\" > </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Gender :</td>\n");
      out.write("                                            <td> ");
      out.print( us.getGender().toUpperCase());
      out.write(" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>About  :</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <textarea rows=\"3\" class=\"form-control\" name=\"user_about\" >");
      out.print( us.getAbout());
      out.write("\n");
      out.write("                                                </textarea>\n");
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>New Profile:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"file\" name=\"image\" class=\"form-control\" >\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-outline-primary\">Save</button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </form>    \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button  id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">EDIT</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--end of Profile modal-->\n");
      out.write("        \n");
      out.write("        <!--add post modal-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"add-post-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Provide the post details..</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <form id=\"add-post-form\" action=\"AddPostServlet?userEmail=");
      out.print( userEmail);
      out.write("&userPassword=");
      out.print( userPassword );
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <select class=\"form-control\" name=\"cid\">\n");
      out.write("                                    <option selected disabled>---Select Category---</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        PostDao postd = new PostDao(ConnectionProvider.getConnection());
                                        ArrayList<Category> list = postd.getAllCategories();
                                        for (Category c : list) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( c.getCid());
      out.write('"');
      out.write('>');
      out.print( c.getName());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input name=\"pTitle\" type=\"text\" placeholder=\"Enter post Title\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea name=\"pContent\" class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter your content\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea name=\"pCode\" class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter your program (if any)\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                               <span class=\"	fa fa-picture-o\"></span> <label>Select your pic..</label>\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"file\" name=\"pic\"  >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"container text-center\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-outline-primary\">Post </button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--END add post modal-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--javascripts-->\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("            integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("                                $(document).ready(function () {\n");
      out.write("                                    let editStatus = false;\n");
      out.write("\n");
      out.write("                                    $('#edit-profile-button').click(function ()\n");
      out.write("                                    {\n");
      out.write("\n");
      out.write("                                        if (editStatus == false)\n");
      out.write("                                        {\n");
      out.write("                                            $(\"#profile-details\").hide()\n");
      out.write("\n");
      out.write("                                            $(\"#profile-edit\").show();\n");
      out.write("                                            editStatus = true;\n");
      out.write("                                            $(this).text(\"Back\")\n");
      out.write("                                        } else\n");
      out.write("                                        {\n");
      out.write("                                            $(\"#profile-details\").show()\n");
      out.write("\n");
      out.write("                                            $(\"#profile-edit\").hide();\n");
      out.write("                                            editStatus = false;\n");
      out.write("                                            $(this).text(\"Edit\")\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    })\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <!--now add post js-->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (e) {\n");
      out.write("                //\n");
      out.write("                $(\"#add-post-form\").on(\"submit\", function (event) {\n");
      out.write("                    //this code gets called when form is submitted....\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    console.log(\"you have clicked on submit..\")\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("\n");
      out.write("                    //now requesting to server\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"AddPostServlet\",\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: form,\n");
      out.write("                        success: function (data, textStatus, jqXHR) {\n");
      out.write("                            //success ..\n");
      out.write("                            console.log(data);\n");
      out.write("                            if (data.trim() == 'done')\n");
      out.write("                            {\n");
      out.write("                                swal(\"Good job!\", \"saved successfully\", \"success\");\n");
      out.write("                            } else\n");
      out.write("                            {\n");
      out.write("                                swal(\"Error!!\", \"Something went wrong try again...\", \"error\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                            //error..\n");
      out.write("                            swal(\"Error!!\", \"Something went wrong try again...\", \"error\");\n");
      out.write("                        },\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false\n");
      out.write("                    })\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!--loading post using ajax-->\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function getPosts(catId, temp) {\n");
      out.write("                $(\"#loader\").show();\n");
      out.write("                $(\"#post-container\").hide()\n");
      out.write("\n");
      out.write("                $(\".c-link\").removeClass('active')\n");
      out.write("\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"load_posts.jsp\",\n");
      out.write("                    data: {cid: catId},\n");
      out.write("                    success: function (data, textStatus, jqXHR) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        $(\"#loader\").hide();\n");
      out.write("                        $(\"#post-container\").show();\n");
      out.write("                        $('#post-container').html(data)\n");
      out.write("                        $(temp).addClass('active')\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function (e) {\n");
      out.write("\n");
      out.write("                let allPostRef = $('.c-link')[0]\n");
      out.write("                getPosts(0, allPostRef)\n");
      out.write("\n");
      out.write("\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
