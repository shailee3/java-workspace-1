import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import static org.hamcrest.Matchers.hasProperty;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class RoleBOJUnit {
	MockRoleDAO mrdao;
	RoleBO rbo;
	@Before
	public void createObject(){
		rbo = new RoleBO();
	}
	@SuppressWarnings("unchecked")
	@Test
	public void testGetAllRoles() {
		mrdao = new MockRoleDAO();
		ArrayList<Role> roleList = new ArrayList<Role>();
		roleList.add(new Role(1, "name1"));
		roleList.add(new Role(2,"name2"));
	    assertThat(roleList, contains(hasProperty("id", equalTo(1)),hasProperty("id", equalTo(2))));
	}
}

class MockRoleDAO extends RoleDAO{
	@Override
	public ArrayList<Role> fetchAllRoles(){
		ArrayList<Role> roleList = new ArrayList<Role>();
		roleList.add(new Role(1, "name1"));
		roleList.add(new Role(2,"name2"));
		return roleList;
	}
}