<%@page import="Com.CodeWithSameer.Dao.UserDao"%>
<%@page import="Com.CodeWithSameer.Dao.LikeDao"%>
<%@page import="Com.CodeWithSameer.Entities.User"%>
<%@page import="Com.CodeWithSameer.Entities.Post"%>
<%@page import="java.util.List"%>
<%@page import="Com.CodeWithSameer.Helper.ConnectionProvider"%>
<%@page import="Com.CodeWithSameer.Dao.PostDao"%>

<div class="row">

    <%
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
    %>

    <div class="col-md-6 mt-2">
        <div class="card">
            <img class="card-img-top" src="blog_pics/<%= p.getpPic()%>" alt="Card image cap">
            <div class="card-body">
                <b><%= p.getpTitle()%></b>
                
                

            </div>
            <div class="card-footer nav-bac text-center">
                <% 
                    LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
                %>

                <a href="#!" onclick="doLike(<%= p.getPid()%>,<%= uuu.getId()%>)" class="btn btn-outline-light btn-sm"> <i class="fa fa-thumbs-o-up"></i> <span class="like-counter"><%= ld.countLikeOnPost(p.getPid())%></span>  </a>

                <a href="show_blog_page.jsp?post_id=<%= p.getPid()%>" class="btn btn-outline-light btn-sm">Read More...</a>
                <a href="#!" class="btn btn-outline-light btn-sm"> <i class="fa fa-commenting-o"></i> <span>20</span>  </a>
            </div>

        </div>


    </div>


    <%
        }
        

    %>

</div>
