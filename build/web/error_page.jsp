<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error || Sorry Something went wrong</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background
            {
                clip-path: polygon(0 0, 100% 0, 100% 30%, 80% 50%, 100% 70%, 100% 100%, 0 100%, 0 70%, 20% 50%, 0 30%);
            }
            .my-background
            {
                background-color: #9575cd; 
            }
            .back1
            {
                background-color: #ff5252;
            }
        </style>
    </head>
    <body class="primary-backgroung">
        <div class="container text-center banner-background back1">
            <br>
            <img src="img/error.png" class="img-fluid">
            <br>
            <h3 class="display-3">Sorry ! Something Went Wrong ...</h3>
            <%= exception %>
            <br>
            <a href="index.jsp" class="btn primary-backgroung btn-lg text-white mt-3 mb-3">Home</a>
            
        </div>
    </body>
</html>
