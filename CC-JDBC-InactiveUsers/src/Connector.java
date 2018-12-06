  import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Connector {
	
	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		Connection con = null;
		try {
		ResourceBundle rb = ResourceBundle.getBundle("mysql");
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
	    
		Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url,username,password);
		}
		
		catch(Exception e)
		{
	       System.out.println(e.getMessage());
		}
		return con;
	}
	
}

