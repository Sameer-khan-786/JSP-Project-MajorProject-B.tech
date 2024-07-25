

<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@page import=" java.sql.Connection"%>
<%@page import=" java.sql.*"%>
<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home || CHATTING HUB</title>
        
        <!--css-->
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background
            {
                clip-path: polygon(54% 0, 100% 0, 100% 45%, 100% 100%, 80% 85%, 56% 100%, 35% 86%, 0 100%, 0 60%, 0 0);
            }
        </style>
    
    </head>
    <body>
        
        <!--nav bar-->
        
        <%@include file="navbar.jsp" %>
        
        <!--Banner-->
        
        <div class="container-fluid p-0 m-0">
            <div class="jumbotron text-white primary-backgroung banner-background">
                <div class="container">
                    <h3 class="display-3">Welcome to CHATTING HUB</h3>
            
            <p>Welcome to the World of Coding</p>
            <a href="register_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-plus"></span> SignUp</a>
            <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-users"></span> LogIn</a>
                </div>
            </div>
        </div>
        
        <!--cards-->
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">HTML Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">CSS Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">JS Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">JAVA Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">PYTHON Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
                <div class="col-md-4">
                      <div class="card" style="">
                      <div class="card-body">
                      <h5 class="card-title">ANGULAR Language</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn primary-backgroung text-white">Read More</a>
                      </div>
                      </div>
                 </div>
            </div>
        </div>
        
        <!--javaScript-->
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        
        
    </body>
</html>
