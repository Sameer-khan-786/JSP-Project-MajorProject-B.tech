<%-- 
    Document   : Contact
    Created on : 27-Apr-2021, 1:23:50 am
    Author     : HP PC
--%>

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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
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
    <nav class="navbar navbar-expand-lg navbar-dark nav-bac" style="position: fixed; top: 0; width: 100%;" >
  
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            
            <a class="navbar-brand" href="index.jsp"> <span class="fa fa-asterisk"></span>   HOME</a>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <span class="	fa fa-check-square-o"></span> Categories
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Programming Language</a>
                    <a class="dropdown-item" href="#">Project Implementation</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Data Structure</a>
                </div>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="Contact.jsp"> <span class="	fa fa-address-card-o"></span> Contact</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="login_page.jsp"> <span class="fa fa-user-circle "></span> Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="register_page.jsp"> <span class="fa fa-user-plus "></span> Sign up</a>
            </li>

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
</body>
</html>
