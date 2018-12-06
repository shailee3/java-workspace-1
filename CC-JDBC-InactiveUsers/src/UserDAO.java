import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserDAO {

	public void makeInActive(int failedAttempts) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Connection con = Connector.getConnection();
		Statement st = con.createStatement();
		String query= String.format("update user set deleted = 1 where failed_attempts >=" +failedAttempts);
		st.executeUpdate(query);
		con.close();		
		
	}

	public ArrayList<User> getInActiveUsers() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
	    
		ArrayList<User> userList = new ArrayList<User>();
		Connection con= Connector.getConnection();
	    Statement st = con.createStatement();
	    ResultSet rs= st.executeQuery("Select * from user where deleted = 1");
	    while(rs.next())
	    {
	    	int id = Integer.parseInt(rs.getString(1));
			String username = rs.getString(2);
			String password = rs.getString(3);
			String address = rs.getString(4);
			String mobile_number = rs.getString(5);
			int deleted = Integer.parseInt(rs.getString(6));
			userList.add(new User(id,username,password,address,mobile_number, deleted));
	    }
	    
	    con.close();
		return userList;
	   }
}
