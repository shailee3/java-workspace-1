
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import sun.util.calendar.CalendarDate;

public class InvoiceBO {


   Item findItemById(Integer itemId,Item item[]){
      
	   for(int i=0;i<item.length;i++)
      {
    	if(item[i].id == itemId)
    	{
    		return item[i];
    	}
      }
	   return null;
   }    
    

  
  
 Double totalInvoiceAmount(Invoice invoice)
 {
   //fill your code  
 }
   
   
 void nextTwoRemainders(Invoice invoice){
      //fill your code  
     

 }
 
 
 
}
