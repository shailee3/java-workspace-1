
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

    public static void main(String args[]) throws IOException, ParseException{
       
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    

    Item item[] = new Item[10];
    SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
    
    

    System.out.println("Item details");
 
       item[0] = new Item(111,"Laptop",28000.00);
       item[1] = new Item(112,"Headset",900.00);   
       item[2] = new Item(113,"Watch",3000.00);
       item[3] = new Item(114,"Fan",5000.00); 
       item[4] = new Item(211,"Keyboard",4000.00); 
       item[5] = new Item(212,"Mouse",300.00);
       item[6] = new Item(311,"Mike",2000.00);
       item[7] = new Item(313,"PC",25000.00);
       item[8] = new Item(314,"Inverter",11000.00);
       item[9] = new Item(315,"TV",30000.00);
       
    InvoiceBO invoiceBO = new InvoiceBO();
 System.out.format("%-15s %-15s %-15s\n","Item id","Item name","Item price");
      
    for(int i=0;i<9;i++){
      
       System.out.format("%-15s %-15s %-15s\n",item[i].getId(),item[i].getName(),item[i].getPrice());   
    }
    
    System.out.println("Enter invoice details");
    String invoiceDetails[] = br.readLine().split(",");
    Invoice invoice = new Invoice(Integer.parseInt(invoiceDetails[0]),invoiceDetails[1],invoiceDetails[2],format.parse(invoiceDetails[3]),format.parse(invoiceDetails[4]));
     
    System.out.println("Enter number of invoice line");
    int number = br.read();
    InvoiceLine invoiceLine[] = new InvoiceLine[number];
    for(int i=1; i<=number; i++)
    {
    	System.out.println("Enter the invoice line " +i+" details");
    	String il[] = br.readLine().split(",");
    	invoiceLine[i] = new InvoiceLine()
    }   
    
    
    }
}
