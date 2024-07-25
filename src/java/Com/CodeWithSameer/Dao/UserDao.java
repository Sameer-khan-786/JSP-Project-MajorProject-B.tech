
package Com.CodeWithSameer.Dao;
import java.sql.*;
import Com.CodeWithSameer.Entities.User;
import Com.CodeWithSameer.Helper.ConnectionProvider;
import Com.CodeWithSameer.Helper.DBConnection;
import java.util.ArrayList;
public class UserDao 
{
   private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
   // method
    
    public boolean saveUser(User user)
    {
         boolean f=false;
         try
         {
            // User Database
            
             String query = "INSERT INTO user(name,email,password,gender,about) values(?,?,?,?,?)";
             PreparedStatement pstmt = this.con.prepareStatement(query);
             pstmt.setString(1, user.getName());
             pstmt.setString(2, user.getEmail());
             pstmt.setString(3, user.getPassword());
             pstmt.setString(4, user.getGender());
             pstmt.setString(5, user.getAbout());
             
             pstmt.executeUpdate();
             f=true;
             
         }
         catch(Exception e)
         {
           e.printStackTrace();
         }
         return f;
     
    }
    
    public User getUserByEmail(String email) throws SQLException {
                String query = "SELECT * FROM user WHERE email = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, email);
		ResultSet set = pstmt.executeQuery();
		User user = new User();
		if(set.next()) {
			String name = set.getString("name");
//             set to user object
                user.setName(name);

                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));
		}
		return user;
	}
    
    public User getUserByEmailAndPassword(String email , String password)
    {
        User user = null;
        
        try 
        {
             String query = "SELECT * FROM user WHERE email=? AND password=?";
             PreparedStatement pstmt = con.prepareStatement(query);
             pstmt.setString(1, email);
             pstmt.setString(2, password);
             
             ResultSet set = pstmt.executeQuery();
             
             if (set.next()) 
            {
                user = new User();
                String name = set.getString("name");
                user.setName(name);
                
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));
            } 
             else 
             {
            }
        } 
        catch (Exception e) 
        {
        }
       return user;
     
    }
    public boolean updateUser(User user) {

        boolean f = false;
        try {

            String query = "UPDATE user SET name=? , email=? , password=? , gender=? ,about=? , profile=? WHERE  id =?";
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, user.getName());
            p.setString(2, user.getEmail());
            p.setString(3, user.getPassword());
            p.setString(4, user.getGender());
            p.setString(5, user.getAbout());
            p.setString(6, user.getProfile());
            p.setInt(7, user.getId());

            p.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public User getUserByUserId(int userId) {
        User user = null;
        try {
            String q = "SELECT * FROM user WHERE id=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, userId);
            ResultSet set = ps.executeQuery();
            if (set.next()) {
                user = new User();

//             data from db
                String name = set.getString("name");
//             set to user object
                user.setName(name);

                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
    
    
    
    public void deleteUser(int user_id) throws SQLException {
                String query = "DELETE FROM user WHERE user_id = ?;";
                PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, user_id);
		st.executeUpdate();
	}
    
    
}
