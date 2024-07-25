<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register || Page</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background
            {
                clip-path: polygon(100% 0, 100% 42%, 100% 100%, 84% 85%, 67% 100%, 33% 100%, 16% 87%, 0 100%, 0 35%, 0 0);
            }
            .my-background
            {
                background-color: #9575cd; 
            }
            .back
            {
                clip-path: polygon(100% 0, 100% 100%, 100% 100%, 82% 28%, 67% 100%, 33% 100%, 17% 26%, 0 100%, 0 100%, 0 0);
            }
            .foot
            {
                clip-path: polygon(69% 0, 69% 0, 84% 12%, 100% 0, 100% 100%, 0 100%, 0 0, 16% 11%, 32% 0, 51% 11%);
            }
        </style>
    </head>
    <body>
        <!--nav bar-->
        <%@include file="navbar.jsp" %>
         
        <main class="my-background back" style="padding-bottom: 20px; padding-top: 20px">
            <div class="container">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-header text-center primary-backgroung banner-background text-white">
                            <span class="fa fa-3x fa-user-plus"></span><br> Register Here
                        </div>
                        <div class="card-body">
                            <form  id="reg-form"action="RegisterServlet" method="POST"> 
  <div class="form-group">
    <label for="First_name">First Name</label>
    <input name="First_name" type="text" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter First Name">
  </div>
  <div class="form-group">
    <label for="Last_name">Last Name</label>
    <input name="Last_name" type="text" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter Last Name">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="user_password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-group">
      <textarea name="about" class="form-control" id=""  rows="5" placeholder="Enter Something About You"></textarea>
  </div>
  <div class="form-group">
                                    <label for="gender">Select Gender</label>
                                    <br>
                                    <input type="radio"  id="gender" name="gender" value="male" >Male
                                    <input type="radio"  id="gender" name="gender" value="famale">Female
                                </div>
  <div class="form-check">
      <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Agree Terms and Conditions</label>
  </div>
    <br>
    <div class="container text-center" id="loader" style="display: none">
        <span class="fa fa-refresh fa-spin fa-4x"></span>
        <h4>Please Wait ...</h4>
    </div>
    
    <br>
    <button id="submit-btn" type="submit" class="btn btn-primary col-md-3 " >Submit</button>
</form>   
                        </div>
                        <div class="card-footer primary-backgroung text-white text-center foot">
                        <span class="fa fa-copyright"></span>    Copyright2021_SameerKhan
                        </div>
                    </div>
                    
                </div>
                
            </div>
        </main>
        
        
        
        <!--javaScript-->
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>
            $(document).ready(function (){
                
                console.log("loaded....");
                
                $('#reg-form').one('submit', function (event){
                    
                    event.preventDefault();
                    
                    let form = new FormData(this);
                    $("#submit-btn").hide();
                    $("#loader").show();
                    // send register servlet
                    $.ajax({
                        url: "RegisterServlet", type: 'POST', data: form,
                        success: function (data, textStatus, jqXHR) {
                        console.log(data);
                        
                        $("#submit-btn").show();
                        $("#loader").hide();
                        
                        if(data.trim()=== 'Done')
                        {
                        swal("Registered Successfully .. We are going to redirect to login page")
                        .then((value) => {
                         window.location = "login_page.jsp";
                        });
                        }
                        else
                        {                            
                            swal(data);
                        }
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        console.log(jqXHR);  
                        
                        $("#submit-btn").show();
                        $("#loader").hide();
                        swal("Something went wrong .. Try again!!");
                    },
                    processData: false,
                    contentType: false
                    
                    });
                });
            });
        </script>
        
    </body>
</html>
