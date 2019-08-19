import java.util.List;

public class Main {
	public static void main(String[] args) {
		RoleDAO roleDAOIns = new RoleDAO();
		RoleBO roleBO = new RoleBO();
		List<Role> roleList = roleBO.getAllRoles(roleDAOIns);
		System.out.println("Role Details:");
		for (Role roleIns : roleList) {
			System.out.println(roleIns.getName());
		}
	}

}
