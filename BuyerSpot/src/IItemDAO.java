import java.sql.SQLException;
import java.util.List;

 // fill the code
public interface IItemDAO{
    public List<Item> getAllItems() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}