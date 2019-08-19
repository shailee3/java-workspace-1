import java.util.*;

public class ShipmentBO {

	public List<Integer> findAllPossibleShipmentNumber(Integer srange,int erange)
	{
		List<Integer> resultantList = new ArrayList<Integer>();
		int i=0;
		int n;
		for(i=srange ; i<=erange ; i++)
		{
			n = i;
			while(n!=0)
			{
				if(n%3 != 0)
					break;
				n/=10;
			}
			if(n == 0)
				resultantList.add(i);
		}
		
		return resultantList;
	}

}
