import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String args[]) throws IOException, ParseException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        
        PurchaseOrderBO purchaseOrderBO = new PurchaseOrderBO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ItemBO itemBO = new ItemBO();
        //fill the code
        List<Item> itemList = itemBO.getAllItems();
        System.out.printf("%-15s %-25s %-25s %-15s\n","Item ID","Name","Available Quantity","Price");
        for(Item item:itemList){
            System.out.printf("%-15s %-25s %-25s %-15s\n",item.getId(),item.getName(),item.getAvailableQuantity(),item.getPrice());
        }
        System.out.println("Creating new purchase order...");
        System.out.println("Enter Customer Name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String customerName = reader.readLine();
        System.out.println("Enter Contact Number:");
        String mobile = reader.readLine();
        System.out.println("Enter Order Date(yyyy-MM-dd):");
        Date orderDate = sdf.parse(reader.readLine());
        System.out.println("Enter all the Item ID you want to purchase:");
        String[] itemStr = reader.readLine().split(",");
        System.out.println("Enter number of quantities:");
        String[] quantitiesStr = reader.readLine().split(",");
        
         // fill the code
        List<Item> purchaseItems = new ArrayList<Item>();
        Integer[] quantity = new Integer[itemStr.length];
        for(int i=0;i<itemStr.length;i++){
        	purchaseItems.add(itemBO.getItemById(Long.parseLong(itemStr[i])));
        	quantity[i] = new Integer(quantitiesStr[i]);
        }
        Long createdId = null;
        try{
        	createdId = purchaseOrderBO.createPurchaseOrder(purchaseItems, quantity, customerName, mobile, orderDate);
        	System.out.println("Order placed with id "+createdId);
        } catch (InsufficientQuantityException e){
        	System.out.println(e.getMessage());
        }         
   
    }
    
}






