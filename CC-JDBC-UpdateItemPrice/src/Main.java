import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ItemDAO itemdao = new ItemDAO();
		
		System.out.println("Item details:");
		System.out.format("%-15s %-15s %s\n","Item ID","Item Name","Price");
		List<Item> items = itemdao.getAllItems();
		for(int i = 0; i< items.size(); i++) {
			System.out.format("%-15s %-15s %s\n", items.get(i).id, items.get(i).name, items.get(i).price);
		}		
		
		System.out.println("Enter the item id to update :");
		String itemId = br.readLine();
		
		System.out.println("Enter the new price :");
		Double newPrice = Double.parseDouble(br.readLine());
		
		itemdao.updateItemPrice(new Item(itemId, "", newPrice), newPrice);
		
		System.out.println("Item details after update :");
		System.out.format("%-15s %-15s %s\n","Item ID","Item Name","Price");
		items = itemdao.getAllItems();
		for(int i = 0; i< items.size(); i++) {
			System.out.format("%-15s %-15s %s\n", items.get(i).id, items.get(i).name, items.get(i).price);
		}
	}
}