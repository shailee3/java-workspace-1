
public class ShipmentBO {

	public int findNearestPort(int port1 , int port2)
	{
		if(port1 < port2)
			return 1;
		if(port1 > port2)
			return -1;
		
		return 0;
	}
	
}
