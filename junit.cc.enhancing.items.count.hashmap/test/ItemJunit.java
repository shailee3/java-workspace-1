import org.hamcrest.collection.IsMapContaining;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;


public class ItemJunit {

	ItemBO itemBO;
	
@Before
	public void init() {
		itemBO = new ItemBO();
	}
	
	@Test
	public void testItemCount() {
		String[] purchase = {"1,Laptop,100","2,Laptop,100","3,Mouse,10"};
		Map<String,Integer> mapcl = itemBO.findItemCount(purchase, purchase.length);
        assertThat(mapcl, IsMapContaining.hasEntry("Laptop", 2));
        
	}
	
@After
	public void destroy() {
		itemBO = null;
	}

}
