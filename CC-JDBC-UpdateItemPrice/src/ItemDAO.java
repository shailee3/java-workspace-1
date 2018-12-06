import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
	
	public List<Item> getAllItems() throws ClassNotFoundException, SQLException {

		ArrayList<Item> itemList = new ArrayList<Item>();
		Connection con= DbConnection.getConnection();
	    Statement st = con.createStatement();
	    ResultSet rs= st.executeQuery("Select id,name,price from item");
	    while(rs.next())
	    {
	    	String id = rs.getString(1);
			String name = rs.getString(2);
			Double price = Double.parseDouble(rs.getString(3));
			itemList.add(new Item(id,name, price));
	    }
	    
	    con.close();
		return itemList;

	}
	public void updateItemPrice(Item item, Double price) throws ClassNotFoundException, SQLException {
		
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		String query= String.format("update item set price = "+ price + " where id =" + item.id);
		st.executeUpdate(query);
		con.close();

	}
	
}