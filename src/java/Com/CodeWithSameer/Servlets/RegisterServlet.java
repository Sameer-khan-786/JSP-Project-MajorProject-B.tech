
package Com.CodeWithSameer.Servlets;



import Com.CodeWithSameer.Dao.UserDao;
import Com.CodeWithSameer.Entities.User;
import Com.CodeWithSameer.Helper.ConnectionProvider;
import Com.Message.UserForMessage;
import Com.Message.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Durgesh
 */

@MultipartConfig
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          

//            fetch all form data
            String check = request.getParameter("check");
            if (check == null) {
                out.println("Please Accept Terms and Condition!!");
            } else {
                //baki ka data yaha nikalna..
                String fn = request.getParameter("First_name");
                String ln = request.getParameter("Last_name");
                String email = request.getParameter("user_email");
                String password = request.getParameter("user_password");
                String gender = request.getParameter("gender");
                String about = request.getParameter("about");
                String name = fn + ln;
                
                
                
                //create user object and set all data to that object..
                User user = new User(name, email, password, gender, about);
                UserForMessage user1 = new UserForMessage(fn, ln, password, email);
                //create a user daao object..
                UserDao dao = new UserDao(ConnectionProvider.getConnection());
                UserDAO dao1 = new UserDAO();
                if (dao.saveUser(user) && dao1.saveUser(user1)) {
//                save..
                    out.println("Done");
                } else {
                    out.println("Email Address Alredy Exist");
                }
            }
         
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

