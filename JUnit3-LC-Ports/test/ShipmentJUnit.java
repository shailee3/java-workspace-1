import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ShipmentJUnit {
	ShipmentBO shipmentBO;
	
	@Before
	public void setup()
	{
		shipmentBO = new ShipmentBO();		
	}
	
	@Test
	public void testFindOneModes()
	{
		String[] portlist = new String[]{"1|Hyd|1|0|0","2|Mumbai|1|1|0","3|Chennai|1|1|1"};
		String[] portlist2 = new String[]{"1|Hyd|1|0|0","2|Mumbai|0|1|0","3|Chennai|0|0|1"};
		assertArrayEquals(new String[]{"Hyd",null,null},shipmentBO.findOneModes(portlist.length,portlist));
		assertArrayEquals(new String[]{"Hyd","Mumbai","Chennai"},shipmentBO.findOneModes(portlist2.length,portlist2));

	}
	
	@Test
	public void testFindMultipleModes() 
	{
		/*String portList3[] = new String[]{"1|Mumbai|1|0|1","2|Ahm|0|0||1","3|Chn|0|0|1"};
		String portList4[] = new String[]{"1|Mumbai|1|0|1","2|Ahm|1|0||1","3|Chn|0|1|1"};
		assertArrayEquals(new String[] {"Mumbai",null,null},shipmentBO.findMultipleModes(portList3.length, portList3));
		assertArrayEquals(new String[] {"Mumbai","Ahm","Chn"},shipmentBO.findMultipleModes(portList4.length, portList4));
	*/
		
		String[] portlist = new String[]{"1|Hyd|1|0|0","2|Mumbai|1|1|0","3|Chennai|1|1|1"};
		String[] portlist2 = new String[]{"1|Hyd|1|0|0","2|Mumbai|0|1|0","3|Chennai|0|0|1"};
		assertArrayEquals(new String[]{"Mumbai","Chennai",null},shipmentBO.findMultipleModes(portlist.length,portlist));
		assertArrayEquals(new String[]{"Hyd","Mumbai","Chennai"},shipmentBO.findMultipleModes(3, new String[]{"1|Hyd|1|0|1","2|Mumbai|1|1|1","3|Chennai|1|1|1"}));
	}
	
	}
