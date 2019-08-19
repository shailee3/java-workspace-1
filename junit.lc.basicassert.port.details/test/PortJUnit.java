import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;
import org.junit.*;

public class PortJUnit {
	private PortBO portBO;
	
	@Before
	public void createObjectForPort()
	{
		//fill code here.
		this.portBO = new PortBO();
	}
	
	@Test
	public void testPortDetails()
	{	
		//fill code here
		List<Port> ports = new ArrayList<Port>();
		ports.add(new Port(1,"Chennai Port","Chennai"));
		ports.add(new Port(2,"Mumbai Port","Mumbai"));
		ports.add(new Port(3,"Kolkata Port","Kolkata"));
		
		this.portBO.addElementAtSpecfiedPosition(ports, 2, "4,something,city");
		assertThat(ports, hasSize(4));
		
		this.portBO.addElementAtSpecfiedPosition(ports, 3, "5,something,city");
		assertThat(ports, hasSize(5));
	}
}
