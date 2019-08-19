import java.sql.SQLException;
import java.util.List;

public class ItemBO {
    public List<Item> getAllItems() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//fill the code
		return new ItemDAO().getAllItems();
	}
	public Item getItemById(Long itemId) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//fill the code
		return new ItemDAO().getItemById(itemId);
	}
}