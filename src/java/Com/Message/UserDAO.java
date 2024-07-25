package Com.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import Com.Message.UserForMessage;
import Com.CodeWithSameer.Helper.DBConnection;

public class UserDAO {
	
	public boolean login(String email, String password) {
		boolean result = false;
		try {
			Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement st = conn.prepareStatement("SELECT * FROM user1 WHERE email = ? AND password = ?");
			st.setString(1, email);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
	            if(rs.getString("email").equals(email) && rs.getString("password").equals(password)) {
	            	result = true;
	            }
	        }
		} catch (SQLException e) {
			result = false;
		}
		return result;
		
	}
        
        public boolean saveUser(UserForMessage user)
    {
         boolean f=false;
         try
         {
            // User Database
            
             Connection conn = DBConnection.getInstance().getConnection();
	     PreparedStatement st = conn.prepareStatement("INSERT INTO user1(first_name, last_name, email, password) VALUES (?, ?, ?, ?);");
	                st.setString(1, user.getFirst_name());
			st.setString(2, user.getLast_name());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());
			st.execute();
             f=true;
             
         }
         catch(Exception e)
         {
           e.printStackTrace();
         }
         return f;
     
    }
	
	public String register(UserForMessage user) {
		try {
			Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement st = conn.prepareStatement("INSERT INTO user1(first_name, last_name, email, password) VALUES (?, ?, ?, ?);");
			st.setString(1, user.getFirst_name());
			st.setString(2, user.getLast_name());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());
			st.execute();
			return "Registration Successful.";
		} catch (Exception e) {
			e.printStackTrace();
			return "Email alreay used.";
		}
	}

	public ArrayList<UserForMessage> getUsersForChat(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM user1 WHERE user_id <> ?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		ArrayList<UserForMessage> array = new ArrayList<>();
		while(rs.next()) {
			UserForMessage u = new UserForMessage();
			u.setUser_id(rs.getInt("user_id"));
			u.setFirst_name(rs.getString("first_name"));
			u.setLast_name(rs.getString("last_name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setImage(rs.getString("image"));
			array.add(u);
		}
		return array; 
	}
	
	public UserForMessage getUserById(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM user1 WHERE user_id = ?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		UserForMessage u = new UserForMessage();
		if(rs.next()) {
			u.setUser_id(rs.getInt("user_id"));
			u.setFirst_name(rs.getString("first_name"));
			u.setLast_name(rs.getString("last_name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setImage(rs.getString("image"));
		}
		return u;
	}
	
	public UserForMessage getUserByEmail(String email) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM user1 WHERE email = ?");
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		UserForMessage u = new UserForMessage();
		if(rs.next()) {
			u.setUser_id(rs.getInt("user_id"));
			u.setFirst_name(rs.getString("first_name"));
			u.setLast_name(rs.getString("last_name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setImage(rs.getString("image"));
		}
		return u;
	}
	
	public void deleteUser(int user_id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("DELETE FROM user1 WHERE user_id = ?;");
		st.setInt(1, user_id);
		st.executeUpdate();
	}
	
	public String updateProfile(UserForMessage user) {
		try {
			Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement st = conn.prepareStatement("UPDATE user1 SET first_name = ?, last_name = ?, email = ? WHERE user_id = ?;");
			st.setString(1, user.getFirst_name());
			st.setString(2, user.getLast_name());
			st.setString(3, user.getEmail());
			st.setInt(4, user.getUser_id());
			st.execute();
			return "Profile Update Successful.";
		} catch (Exception e) {
			e.printStackTrace();
			return "Email alreay used.";
		}
	}
	
	public String updatePassword(UserForMessage user) {
		try {
			Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement st = conn.prepareStatement("UPDATE user1 SET password = ? WHERE user_id = ?;");
			st.setString(1, user.getPassword());
			st.setInt(2, user.getUser_id());
			st.execute();
			return "Password Update Successful.";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Password Update Failed.";
		}
	}
}
