import java.util.*; 
public class ItemBO {
	 
	 public List<String> getUniqueItems(List<String> itemName) {
		 return new ArrayList<String>(new LinkedHashSet<String>(itemName));
	 }
	 
	 public List<String> getMaxItems(List<String> itemName) {
		 List<Integer> count = new ArrayList<Integer>();
		 for(int i=0;i<itemName.size();i++) {
			 count.add(Collections.frequency(itemName,itemName.get(i)));
		 }
		 List<String> max = new ArrayList<String>();
		 Integer val = Collections.max(count);
		 for(int i=0;i<itemName.size();i++) {
			 if(count.get(i).equals(val)) {
				 max.add(itemName.get(i));
			 }
		 }
		 return new ArrayList<String>(new LinkedHashSet<String>(max));
	 }
	 
	 public List<String> getMinItems(List<String> itemName) {
		 List<Integer> count = new ArrayList<Integer>();
		 for(int i=0;i<itemName.size();i++) {
			 count.add(Collections.frequency(itemName,itemName.get(i)));
		 }
		 List<String> min = new ArrayList<String>();
		 Integer val = Collections.min(count);
		 for(int i=0;i<itemName.size();i++) {
			 if(count.get(i).equals(val)) {
				 min.add(itemName.get(i));
			 }
		 }
		 return new ArrayList<String>(new LinkedHashSet<String>(min));
	 }
}