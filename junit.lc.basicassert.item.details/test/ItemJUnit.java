import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ItemJUnit {
	ItemBO itemBO;
	List<String> items;
	
	@Before
	public void createObjectForItemBO() {
		itemBO = new ItemBO();
	}
	
	@Test
	public void testUniqueItems() {
		 items = new ArrayList<String>(Arrays.asList("p1","p2","p3","p2","x","p3","p3"));
		 List<String> items1 = new ArrayList<String>(Arrays.asList("p2","p3","p2","p3","p3"));

		 List<String> unique = new ArrayList<String>(Arrays.asList("p1","p2","p3","x"));
		 List<String> max1 = new ArrayList<String>(Arrays.asList("p2","p3"));

		 assertThat(itemBO.getUniqueItems(items), is(unique));
		 assertThat(itemBO.getUniqueItems(items1), is(max1));
		 assertThat(itemBO.getUniqueItems(unique), is(unique));
	}
	
	@Test
	 public void testMaxItems() {
	 items = new ArrayList<String>(Arrays.asList("p1","p2","p3","p2","x","p3","p3"));
	 List<String> items2 = new ArrayList<String>(Arrays.asList("p2","p3","p2","p3"));

	 List<String> unique = new ArrayList<String>(Arrays.asList("p1","p2","p3","x"));
	 List<String> max = new ArrayList<String>(Arrays.asList("p3"));
	 List<String> max1 = new ArrayList<String>(Arrays.asList("p2","p3"));
	 //fill the code
	 assertThat(itemBO.getMaxItems(items), is(max));
	 assertThat(itemBO.getMaxItems(items2), is(max1));
	 assertThat(itemBO.getMaxItems(unique), is(unique));

	 }

	 @Test
	 public void testMinItems() {
	 items = new ArrayList<String>(Arrays.asList("p1","p2","p3","p2","x","p3","p3"));
	 List<String> items1 = new ArrayList<String>(Arrays.asList("p2","p3","p2","p3","p3"));

	 List<String> unique = new ArrayList<String>(Arrays.asList("p1","p2","p3","x"));
	 List<String>  min = new ArrayList<String>(Arrays.asList("p1","x"));
	 List<String>  min1 = new ArrayList<String>(Arrays.asList("p2"));
	 //fill the code
	 assertThat(itemBO.getMinItems(items), is(min));
	 assertThat(itemBO.getMinItems(items1), is(min1));
	 assertThat(itemBO.getMinItems(unique), is(unique));
	 }
}