import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.PreparedStatement;

public class ItemDAO implements IItemDAO {

    public List<Item> getAllItems() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		// fill the code
		List<Item> itemList = new ArrayList<Item>();
		Connection con = DBUtils.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from item");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Item item = new Item();
			item.setId(rs.getLong(1));
			item.setName(rs.getString(2));
			item.setAvailableQuantity(rs.getInt(3));
			item.setPrice(rs.getDouble(4));
			itemList.add(item);
		}
			return itemList;
	}

	public Item getItemById(Long itemId) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// fill the code
		Item item=new Item();
		Connection con = DBUtils.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from item where id=?");
		ps.setLong(1, itemId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			item.setId(rs.getLong(1));
			item.setName(rs.getString(2));
			item.setAvailableQuantity(rs.getInt(3));
			item.setPrice(rs.getDouble(4));
		}
		return item;
	}

}