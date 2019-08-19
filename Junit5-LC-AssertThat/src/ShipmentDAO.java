import java.text.SimpleDateFormat;
import java.util.*;
public class ShipmentDAO {
	static List<Shipment> shipmentList = new ArrayList<Shipment>();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static 
	{
		try
		{
			shipmentList .add(new Shipment(45,"Laptop",sdf.parse("12/10/2016"),15));
			shipmentList .add(new Shipment(85,"Television",sdf.parse("11/11/2015"),43));
			shipmentList .add(new Shipment(12,"Washing Machine",sdf.parse("26/04/2016"),55));
			shipmentList .add(new Shipment(44,"Air Conditioner",sdf.parse("05/02/2014"),39));
			shipmentList .add(new Shipment(11,"Air Cooler",sdf.parse("01/01/2015"),37));
			shipmentList .add(new Shipment(77,"Personal Computer",sdf.parse("02/02/2017"),26));
			shipmentList .add(new Shipment(55,"Samsung Mobile",sdf.parse("12/05/2013"),12));
			shipmentList .add(new Shipment(22,"Home Theater",sdf.parse("15/12/2013"),22)
					);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
