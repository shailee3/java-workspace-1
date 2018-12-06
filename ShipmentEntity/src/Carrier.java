public class Carrier extends ShipmentEntity{
    
   private String carrierCode;
   private String iata;
  
   Carrier(String shipmentEntityName,String identificationNumber,String carrierCode,String iata)
   {
           super(shipmentEntityName, identificationNumber);
	 	this.carrierCode = carrierCode;
	 	this.iata = iata;
   }
    
      public void setCarrierCode(String carrierCode){
      this.carrierCode = carrierCode;
     }
     public String getCarrierCode(){
      return carrierCode;
     }
     
    
     public void setIata(String iata){
      this.iata = iata;
     }
     public String getIata(){
      return iata;
     }

     @Override
     void display()
     {
    	 System.out.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName, identificationNumber, carrierCode, iata);
     }
}

