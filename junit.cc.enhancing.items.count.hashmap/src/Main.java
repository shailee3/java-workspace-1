import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of purchases:");
        int numberOfPurchases = Integer.parseInt(reader.readLine());
        String[] purchaseDetails = new String[numberOfPurchases];
        System.out.println("Enter all the purchases: (Order id, Item name, Price)");
        for(int i=0;i<numberOfPurchases;i++) {
          purchaseDetails[i] = reader.readLine();
        }
        System.out.println("Item name          Count");
        HashMap<String,Integer> hashMap = new ItemBO().findItemCount(purchaseDetails, numberOfPurchases);
        for(Map.Entry<String,Integer> m:hashMap.entrySet()){  
              System.out.println(m.getKey()+"          "+m.getValue());  
        }
    }
}