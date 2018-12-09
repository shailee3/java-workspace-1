import java.util.List;

public class RoleBO {
	List<Role> getAllRoles(RoleDAO roleDAOIns) {
		return roleDAOIns.fetchAllRoles();

	}
}
