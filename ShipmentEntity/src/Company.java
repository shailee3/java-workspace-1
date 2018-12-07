public class Company extends ShipmentEntity{
    
     private String identifier;
     private String iata;
     private String fmc;
    
     Company(String shipmentEntityName,String identificationNumber,String identifier,String iata,String fmc)
     {
        super(shipmentEntityName, identificationNumber);
         this.identifier = identifier;
     	this.iata = iata;
     	this.fmc = fmc;
     }

     public String getIdentifier(){
    	 return this.identifier;
     }
     
     public String getIata(){
    	 return this.iata;
     }
     
     public String getFmc(){
    	 return this.fmc;
     }
     
     public void setIdentifier(String identifier){
    	 this.identifier = identifier;
     }
    
     public void setIata(String iata){
    	 this.iata = iata;
     }
     
     public void setFmc(String fmc){
    	  this.fmc = fmc;
     }
     
     @Override
     void display()
     {
    	 System.out.format("%-15s %-25s %-15s %-15s %-15s\n", shipmentEntityName, identificationNumber, identifier, iata, fmc);     	
     }    
}
