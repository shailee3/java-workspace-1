import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RoleDAO {

	public ArrayList<Role> fetchAllRoles() {
		ArrayList<Role> roleList = new ArrayList<Role>();
		try {
			Connection connection = DbConnection.getConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st
					.executeQuery("SELECT * FROM role ORDER by NAME ASC ");
			while (rs.next()) {
				Role roleIns = new Role(rs.getInt("id"), rs.getString("name"));
				roleList.add(roleIns);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roleList;
	}

}
