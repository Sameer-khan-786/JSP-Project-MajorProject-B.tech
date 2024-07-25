<%@page import="Com.Message.UserForMessage"%>
<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Com.Message.Message1"%>
<%@ page import="Com.Message.UserDAO"%>
<%@page import="Com.CodeWithSameer.Dao.UserDao"%>
<%@page import="Com.CodeWithSameer.Entities.User"%>
<%
    UserForMessage user2 = (UserForMessage) request.getAttribute("user_id");
    
    
    
    
if (session == null || session.getAttribute("user_id") == null) {
	response.sendRedirect("login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Message | CHATTING HUB</title>
<link rel="shortcut icon" href="image/logo.png">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style>
.type_msg {
	width: 100%;
	display: block;
	position: fixed;
	bottom: 20px;
}

.input_msg_write input {
	float: bottom;
	background: #ffffff;
	border: medium none;
	font-size: 15px;
	min-height: 48px;
	width: 100%;
}

.msg_send_btn {
	background: #05728f none repeat scroll 0 0;
	border: medium none;
	border-radius: 50%;
	color: #fff;
	cursor: pointer;
	font-size: 17px;
	height: 33px;
	position: absolute;
	right: 0;
	top: 11px;
	width: 33px;
}

.container {
	margin-top: 120px;
	margin-bottom: 55px;
}

@media ( max-width :800px) {
	.container {
		margin-top: 240px !important;
		padding: 20px;
		margin-bottom: 40px;
	}
}
</style>
</head>

<body class="bg-dark">

	<!--nav bar start-->
        
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #311b92;">
    <a class="navbar-brand" href="profile.jsp"><span class="fa fa-desktop"></span> CHATTING HUB </a>
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

	<div class="container">
	
		<%
			ArrayList<Message1> messages = (ArrayList<Message1>) request.getAttribute("messages");
			
			if(messages.size() == 0){
				%><h4 style="text-align: center; color: #ffffff;">No Messages.</h4><%
			}
			
			for(int i=0; i<messages.size(); i++){
				if(messages.get(i).getFrom_user().equals(session.getAttribute("user_id").toString())){
					%>
						<div class="row justify-content-end">
						<div class="col-8 alert alert-primary" role="alert">
							<h5>
								me <a href="${pageContext.request.contextPath}/view-message?id=<%= request.getAttribute("to_user") %>&delete=<%= messages.get(i).getChat_id() %>" class="card-link" style="float: right;"><i
									style="color: red;" class="far fa-trash-alt"></i></a>
							</h5>
							 <%= messages.get(i).getMessage() %>
							<p style="text-align: right;"><%= messages.get(i).getChat_time() %></p>
						</div>
						</div>
					<%
				} else {
					%>
					<div class="row justify-content-start">
					<div class="col-8 alert alert-secondary" role="alert">
						<h5>
							<%= new UserDAO().getUserById(Integer.parseInt(messages.get(i).getFrom_user())).getFirst_name() %> <a href="${pageContext.request.contextPath}/view-message?id=<%= request.getAttribute("to_user") %>&delete=<%= messages.get(i).getChat_id() %>" class="card-link" style="float: right;"><i
								style="color: red;" class="far fa-trash-alt"></i></a>
						</h5>
						<%= messages.get(i).getMessage() %>
						<p style="text-align: right;"><%= messages.get(i).getChat_time() %></p>
					</div>
					</div>
					<%
				}
			}
		%>

	</div>

	<div class="type_msg"
		style="padding-left: 10px; padding-right: 10px; bottom: 10px;">
		<form method="post" action="view-message">
			<div class="input_msg_write">
				<input type="hidden" name="to_user" value="<%=request.getAttribute("to_user")%>" /> 
				<input type="text" name="message" class="write_msg" placeholder="Type a message" style="padding: 5px; border-radius: 20px; outline: none" />
				<button class="msg_send_btn" type="submit" style="margin-right: 20px; margin-top: -2px; outline: none;">
					<i class="fa fa-paper-plane-o" aria-hidden="true"></i>
				</button>
			</div>
		</form>
	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		window.scrollTo(0, document.documentElement.scrollHeight);
	</script>
</body>
</html>