
package Com.CodeWithSameer.Helper;
import java.sql.Connection;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class ConnectionProvider 
{
   private static Connection con; 
   public static Connection getConnection()
   {
       try
       {
           if(con == null)
           {
                 Class.forName("com.mysql.cj.jdbc.Driver");

	    	// Creating a connection
            
	    	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/CodeWithSameer","root","Sameer@786");
            
              
           }
       }
       catch(ClassNotFoundException | SQLException e)
       {
           e.printStackTrace();
       }
        return con;
   }
      
}
