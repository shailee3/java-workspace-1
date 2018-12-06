

import java.util.Date;
public class Invoice {
    
    Integer id;
    String raisedBy;
    String customerName;
    Date startDate;
    Date dueDate;
    InvoiceLine invoiceLine[];
        
    
  Invoice(){}
  Invoice(Integer id,String raisedBy,String customerName,Date startDate,Date dueDate){
    
    this.id = id;
    this.raisedBy = raisedBy;
    this.customerName = customerName;       
    this.startDate = startDate; 
    this.dueDate = dueDate;
 
   }
  
  
    void setId(Integer id){
        this.id = id;
    }
    Integer getId(){
        return id;
    }

    void setRaisedBy(String raisedBy){
        this.raisedBy = raisedBy;
    }
    String getRaisedBy(){
        return raisedBy;
    }
  
    void setcCustomerName(String customerName){
        this.customerName = customerName;
    }
    String getCustomerName(){
        return customerName;
    }
  
    void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    Date getStartDate(){
        return startDate;
    }
  
    void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
    Date getDueDate(){
        return dueDate;
    }
     
    void setInvoiceLine(InvoiceLine invoiceLine[]){
        this.invoiceLine = invoiceLine;
    }
    InvoiceLine[] getInvoiceLine(){
        return invoiceLine;
    }
    
}
