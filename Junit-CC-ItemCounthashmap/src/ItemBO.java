import java.util.*;
public class ItemBO {

	public HashMap<String,Integer> findItemCount(String[] purchase,Integer numberOfPurchases) {
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		String[] purchaseDetails;
		for(int i=0;i<numberOfPurchases;i++) {
	          purchaseDetails = purchase[i].split(",");
	          if(!hashMap.containsKey(purchaseDetails[1])){
	              hashMap.put(purchaseDetails[1], 1);
	          }
	          else{
	              Integer c = hashMap.get(purchaseDetails[1]);
	              hashMap.put(purchaseDetails[1], ++c);
	          }
	        }
		return hashMap;
	}
}
