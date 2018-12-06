import java.io.*;
import java.text.ParseException;
public class Main {
    
    public static void main(String args[]) throws IOException, ParseException
    {
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of shipment entity");
        int n = Integer.parseInt(br.readLine());
        String str[];
        
        ShipmentEntity shipments[] = new ShipmentEntity[n];
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter the shipment entity " +(i+1)+" details :");
        	System.out.println("Select the shipment entity type");
        	System.out.println("1)Customer\n2)Company\n3)Agent\n4)Carrier");
        	choice = Integer.parseInt(br.readLine());
        	str = br.readLine().split(",");
        	
        	switch(choice)
        	{
	        	case 1:
        			shipments[i] = new Customer(str[0], str[1], Integer.parseInt(str[2]), str[3]);
        			break;
	        	case 2:
        			shipments[i] = new Company(str[0], str[1], str[2], str[3], str[4]);
					break;
	        	case 3:
        			shipments[i] = new Agent(str[0], str[1], str[2], str[3], str[4]);
					break;	
	        	case 4:
        			shipments[i] = new Carrier(str[0], str[1], str[2], str[3]);
					break;
        	}
        }
        
        System.out.println("Shipment details are");
        System.out.println("Enter the shipment entity type to display");
        String entity = br.readLine();
        
        switch(entity)
        {
        	case "Customer":
        		System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
        		for(int i=0;i<n;i++)
        		{
                	ShipmentEntity se = shipments[i];
                	if(se instanceof Customer)
                		((Customer)se).display();
        		}
        		break;
        	case "Company":
        		System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
        		for(int i=0;i<n;i++)
        		{
                	ShipmentEntity se = shipments[i];
                	if(se instanceof Company)
                		((Company)se).display();
        		}
        		break;
        	case "Agent":
        		System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");
        		for(int i=0;i<n;i++)
        		{
                	ShipmentEntity se = shipments[i];
                	if(se instanceof Agent)
                		((Agent)se).display();
        		}
        		break;
        	case "Carrier":
        		System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
        		for(int i=0;i<n;i++)
        		{
                	ShipmentEntity se = shipments[i];
                	if(se instanceof Carrier)
                		((Carrier)se).display();
        		}
        		break;
        }
    }
}

