<%-- 
    Document   : contactus
    Created on : 20-Dec-2021, 2:25:05 am
    Author     : HP PC
--%>
<%@page import="Com.CodeWithSameer.Dao.UserDao"%>
<%@page import="Com.CodeWithSameer.Entities.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@page import="Com.CodeWithSameer.Dao.PostDao"%>
<%@page import="Com.CodeWithSameer.Entities.Message"%>
<%@page import="Com.CodeWithSameer.Entities.User"%>
<%@page errorPage="error_page.jsp" %>
<%

            String userEmail = request.getParameter("userEmail");
            String userPassword = request.getParameter("userPassword");
           
    if (session == null || session.getAttribute("user_id") == null) {
		response.sendRedirect("login_page.jsp");
	}
    

%>
<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@page import=" java.sql.Connection"%>
<%@page import=" java.sql.*"%>
<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact - Us || CHATTING HUB</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    
    <section>
        <div class="container">
            <div class="contactInfo">
                <div>
                    <h2>Contact Info</h2>
                    <ul class="info">
                        <li>
                            <span><img src="img/location.png" alt=""></span>
                            <span>
                                NH-3 IPS Academy<br>
                                Rajendra Nagar, Indore, Madhya Pradesh<br>
                                452012
                            </span>
                        </li>
                        <li>
                            <span><img src="img/mail.png" alt=""></span>
                            <span>sk7869224111@gmail.com</span>
                        </li>
                        <li>
                            <span><img src="img/call.png" alt=""></span>
                            <span>6266-277-373</span>
                        </li>
                    </ul>
                </div>
                <ul class="sci">
                    <li><a href="#"><img src="img/1.png" alt=""></a></li>
                    <li><a href="#"><img src="img/2.png" alt=""></a></li>
                    <li><a href="#"><img src="img/3.png" alt=""></a></li>
                    <li><a href="#"><img src="img/4.png" alt=""></a></li>
                    <li><a href="#"><img src="img/5.png" alt=""></a></li>
                </ul>
            </div>

            <div class="contactForm">
                <h2>Send a Message</h2>
                <div class="formBox">
                    <div class="inputBox w50">
                        <input type="text" name="" id="" required >
                        <span>First Name</span>
                    </div>
                    <div class="inputBox w50">
                        <input type="text" name="" id="" required >
                        <span>Last Name</span>
                    </div>
                    <div class="inputBox w50">
                        <input type="text" name="" id="" required >
                        <span>Email Name</span>
                    </div>
                    <div class="inputBox w50">
                        <input type="text" name="" id="" required >
                        <span>Mobile Name</span>
                    </div>
                    <div class="inputBox w100">
                        <textarea name="" id="" required></textarea>
                        <span>Write Your Message Here...</span>
                    </div>
                    <div class="inputBox w100">
                        <input type="submit" value="Submit">
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #311b92; position: fixed; top: 0; width: 100%;">
    <a class="navbar-brand" href="profile.jsp"><span class="fa fa-desktop"></span> Code-With-Sameer</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="profile.jsp"><span class="fa fa-home"></span> Home <span class="sr-only">(current)</span></a>
      </li>
     
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         <span class="fa fa-navicon"></span> Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a href="#" onclick="getPosts(0, this)"  class=" c-link list-group-item list-group-item-action active">
                                All Posts
                            </a>
                            <!--categories-->

                            <%                                PostDao d1 = new PostDao(ConnectionProvider.getConnection());
                                ArrayList<Category> list2 = d1.getAllCategories();
                                for (Category cc : list2) {

                            %>
                            <a href="#" onclick="getPosts(<%= cc.getCid()%>, this)" class=" c-link list-group-item list-group-item-action"><%= cc.getName()%></a>


                            <%                                        }

                            %>
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="contactus.jsp"><span class="fa fa-address-book-o"></span> Contact</a>
      </li>
      </li>
       
      <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/message?userEmail=<%= userEmail%>&userPassword=<%= userPassword %>"><span class="fa fa-comments-o"></span> Message</a>
      </li>
       
      
    </ul>
      <ul class="navbar-nav mr-right">
          
          
          <li class="nav-item">
          <a class="nav-link" href="LogoutServlet"> <span class="fa fa-user-plus "></span> Logout</a>
          </li>
      </ul>
  </div>
</nav>
</body>
</html>