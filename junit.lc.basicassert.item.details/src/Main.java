import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		int i;
		List<String> itemName = new ArrayList<String>();
		for(i=0;i<n;i++){
			itemName.add(buff.readLine());
		}
		ItemBO itemBO = new ItemBO();
		
		List<String> itemArray = itemBO.getUniqueItems(itemName);
		
		System.out.println("The unique items are");
		for(i=0;i<itemArray.size();i++){
			System.out.println(itemArray.get(i));
		}
		
		itemArray = itemBO.getMaxItems(itemName);
		System.out.println("The maximum purchased item(s) are ");
		for(i=0;i<itemArray.size();i++){
			System.out.println(itemArray.get(i));
		}
		
		itemArray = itemBO.getMinItems(itemName);
		System.out.println("The minimum purchased item(s) are ");
		for(i=0;i<itemArray.size();i++){
			System.out.println(itemArray.get(i));
		}
	}
}