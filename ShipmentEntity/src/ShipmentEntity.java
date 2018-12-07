public class ShipmentEntity {
    
    protected String shipmentEntityName;
    protected String identificationNumber;
    
    ShipmentEntity(String shipmentEntityName,String identificationNumber)
    {
        this.shipmentEntityName = shipmentEntityName;
        this.identificationNumber = identificationNumber;
    }
    
    public String getShipmentEntityName(){
    	return shipmentEntityName;
    }
    
    public String getIdentificationNumber(){
    	return identificationNumber;
    }
    
    public void setShipmentEntityName(String shipmentEntityName){
      this.shipmentEntityName = shipmentEntityName;
    }
    
    public void setIdentificationNumber(String identificationNumber){
      this.identificationNumber = identificationNumber;
    }
    
    void display()
    {
    	System.out.println("Running default Display method");
    }
}
