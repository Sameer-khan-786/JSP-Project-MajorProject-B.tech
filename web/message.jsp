<%@page import="Com.Message.Message1"%>
<%@page import="Com.Message.MessageDAO"%>
<%@page import="Com.Message.UserForMessage"%>
<%@page import="Com.Message.UserDAO" %>
<%@page import="Com.CodeWithSameer.Entities.Category"%>
<%@page import="Com.CodeWithSameer.Entities.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@page import="Com.CodeWithSameer.Dao.PostDao"%>
<%@page import="Com.CodeWithSameer.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

    String userEmail = request.getParameter("userEmail");
    String userPassword = request.getParameter("userPassword");
   
    
    UserDAO dao1 = new UserDAO();
    UserForMessage user2 = dao1.getUserByEmail(userEmail);
    
    if (session == null || session.getAttribute("user_id") == null) {
	response.sendRedirect("login_page.jsp");
}

%>



<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Messages || CHATTING HUB</title>
         <!--css-->
         <link rel="shortcut icon" href="image/logo.png">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <style>
            .container {
	    margin-top: 120px;
	}
	
	@media (max-width:800px){
		.container {
	    	margin-top: 240px !important;
		}
	}
	
	#newMessageBtn {
		display: block;
		position: fixed;
		bottom: 20px;
		right: 30px;
		z-index: 99;
		font-size: 18px;
		border: none;
		outline: none;
		background-color: #1fa3f4;
		color: white;
		cursor: pointer;
		padding: 15px;
		border-radius: 100%;
		width: 60px;
    	height: 60px;
	}
	
	#newMessageBtn:hover {
		background-color: #0373b7;
	}
            .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);
            }

            body{
                background-color: #d7ccc8;
                background-size: cover;
                background-attachment: fixed;
            }
            .primary-backgroung
{
    background-color: #5e35b1;
}


        </style>
    </head>
    <body>
     
        
        <!--nav bar start-->
        
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #311b92;">
    <a class="navbar-brand" href="profile.jsp"><span class="fa fa-desktop"></span> CHATTING HUB</a>
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
          <a class="dropdown-item" href="#">HTML</a>
          <a class="dropdown-item" href="#">CSS</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">JS</a>
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#"><span class="fa fa-address-book-o"></span> Contact</a>
      </li>
     
       
      <li class="nav-item">
        <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post-modal" > <span class="	fa fa-pencil-square-o"></span> Post</a>
      </li>
      
    </ul>
      <ul class="navbar-nav mr-right">
          
          <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/message"><span class="fa fa-comments-o"></span> Message</a>
      </li>
          
          <li class="nav-item">
          <a class="nav-link" href="LogoutServlet"> <span class="fa fa-user-plus "></span> Logout</a>
          </li>
      </ul>
  </div>
</nav>
        
        
        
        <!--end of nav bar-->
        
        
        
        <!--main Message Display start-->
        
        <main role="main">

		<div class="container">
		
		<%
			ArrayList<Message1> messages = (ArrayList<Message1>) request.getAttribute("messages");
			
			if(messages.size() == 0){
                %><h4 style="text-align: center; color: #ffffff;">No Messages.</h4><%
			}
			
			for(int i=0; i<messages.size(); i++){
				if(messages.get(i).getFrom_user().equals(session.getAttribute("user_id").toString())){
					%>
						<div class="card mb-3">
						  <div class="card-body">
						  	<div class="row">
						  		<div class="col-2">
							  		<img style="width: 100%; border-radius: 100%;" src="<%= new UserDAO().getUserById(Integer.parseInt(messages.get(i).getTo_user())).getImage()%>" />
							  	</div>
							  	<div class="col-10" style="cursor: pointer;" onclick="window.location.href='view-message?id=<%= messages.get(i).getTo_user() %>'">
								  	<h5 class="card-title"><%= new UserDAO().getUserById(Integer.parseInt(messages.get(i).getTo_user())).getFirst_name() %></h5>
								    <h6 class="card-subtitle mb-2 text-muted"><%= messages.get(i).getMessage() %></h6>
								    <p class="card-text"><%= messages.get(i).getChat_time() %></p>
							  	</div>
							 </div>
							 <div class="row">
								<div class="col-12">
						  			<a href="${pageContext.request.contextPath}/message?delete=<%=messages.get(i).getTo_user() %>" class="card-link" style="float: right;"><i style="font-size: 25px;color:red;" class="far fa-trash-alt"></i></a>
						  		</div>							  
						  	 </div>
							</div>
						</div>
					<%
				} else {
					%>
					<div class="card mb-3">
					  <div class="card-body">
					  	<div class="row">
					  		<div class="col-2">
                                                            <img style="width: 100%; border-radius: 100%;" src="<%= new UserDAO().getUserById(Integer.parseInt(messages.get(i).getFrom_user())).getImage()%>" />
						  	</div>
						  	<div class="col-10" style="cursor: pointer;" onclick="window.location.href='view-message?id=<%= messages.get(i).getTo_user() %>'">
                                                            <h5 class="card-title"><%= new UserDAO().getUserById(Integer.parseInt(messages.get(i).getTo_user())).getFirst_name() %></h5>
							    <h6 class="card-subtitle mb-2 text-muted"><%= messages.get(i).getMessage() %></h6>
							    <p class="card-text"><%= messages.get(i).getChat_time() %></p>
						  	</div>
						</div>
						<div class="row">
							<div class="col-12">
						  		<a href="${pageContext.request.contextPath}/message?delete=<%=messages.get(i).getFrom_user() %>" class="card-link" style="float: right;"><i style="font-size: 25px;color:red;" class="far fa-trash-alt"></i></a>
						  	</div>
						</div>
						</div>
					</div>
					<%
				}
			}
		%>
		
		</div>
		
		<button id="newMessageBtn" data-toggle="modal" data-target="#newChatModal">
			<i class="fas fa-plus"></i>
		</button>
		
		<!-- Modal -->
		<div class="modal fade" id="newChatModal" tabindex="-1" role="dialog"
			aria-labelledby="chatModalTitle" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="chatModalTitle">Friends List</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body"
						style="overflow-y: scroll; max-height: 350px;">
						<%
							ArrayList<UserForMessage> newUsers = (ArrayList<UserForMessage>) request.getAttribute("newUsers");
	
							for (int i = 0; i < newUsers.size(); i++) {
							%>
		
							<div style="cursor: pointer;  margin: 5px;" class="card"
								onclick="javascript:window.location='view-message?id=<%=newUsers.get(i).getUser_id()%>';">
								<div class="card-body">
									<%=newUsers.get(i).getFirst_name() + " " + newUsers.get(i).getLast_name()%>
									<i style="float: right;" class="fas fa-paper-plane"></i>
								</div>
							</div>
		
							<%
							}
						%>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
		
	</main>
        
        <!--display message end-->

        
        <!--start of profile modal - display profile details-->
        
        
        
        <!--add post modal-->



        <!-- Modal -->
        <div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Provide the post details..</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form id="add-post-form" action="AddPostServlet" method="post">

                            <div class="form-group">
                                <select class="form-control" name="cid">
                                    <option selected disabled>---Select Category---</option>

                                    <%
                                        PostDao postd = new PostDao(ConnectionProvider.getConnection());
                                        ArrayList<Category> list = postd.getAllCategories();
                                        for (Category c : list) {
                                    %>
                                    <option value="<%= c.getCid()%>"><%= c.getName()%></option>

                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group">
                                <input name="pTitle" type="text" placeholder="Enter post Title" class="form-control"/>
                            </div>

                            <div class="form-group">
                                <textarea name="pContent" class="form-control" style="height: 200px;" placeholder="Enter your content"></textarea>
                            </div>
                            <div class="form-group">
                                <textarea name="pCode" class="form-control" style="height: 200px;" placeholder="Enter your program (if any)"></textarea>
                            </div>
                            <div class="form-group">
                               <span class="	fa fa-picture-o"></span> <label>Select your pic..</label>
                                <br>
                                <input type="file" name="pic"  >
                            </div>

                            <div class="container text-center">
                                <button type="submit" class="btn btn-outline-primary">Post </button>
                            </div>

                        </form>


                    </div>

                </div>
            </div>
        </div>


        <!--END add post modal-->
        
        
        
        <!--javascripts-->
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        
        <script>
                                $(document).ready(function () {
                                    let editStatus = false;

                                    $('#edit-profile-button').click(function ()
                                    {

                                        if (editStatus == false)
                                        {
                                            $("#profile-details").hide()

                                            $("#profile-edit").show();
                                            editStatus = true;
                                            $(this).text("Back")
                                        } else
                                        {
                                            $("#profile-details").show()

                                            $("#profile-edit").hide();
                                            editStatus = false;
                                            $(this).text("Edit")

                                        }


                                    })
                                });

        </script>
        
        <!--now add post js-->
        <script>
            $(document).ready(function (e) {
                //
                $("#add-post-form").on("submit", function (event) {
                    //this code gets called when form is submitted....
                    event.preventDefault();
                    console.log("you have clicked on submit..")
                    let form = new FormData(this);

                    //now requesting to server
                    $.ajax({
                        url: "AddPostServlet",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            //success ..
                            console.log(data);
                            if (data.trim() == 'done')
                            {
                                swal("Good job!", "saved successfully", "success");
                            } else
                            {
                                swal("Error!!", "Something went wrong try again...", "error");
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            //error..
                            swal("Error!!", "Something went wrong try again...", "error");
                        },
                        processData: false,
                        contentType: false
                    })
                })
            })
        </script>

        <!--loading post using ajax-->
        <script>

            function getPosts(catId, temp) {
                $("#loader").show();
                $("#post-container").hide()

                $(".c-link").removeClass('active')


                $.ajax({
                    url: "load_posts.jsp",
                    data: {cid: catId},
                    success: function (data, textStatus, jqXHR) {
                        console.log(data);
                        $("#loader").hide();
                        $("#post-container").show();
                        $('#post-container').html(data)
                        $(temp).addClass('active')

                    }
                })

            }

            $(document).ready(function (e) {

                let allPostRef = $('.c-link')[0]
                getPosts(0, allPostRef)


            })
        </script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </body>
</html>
