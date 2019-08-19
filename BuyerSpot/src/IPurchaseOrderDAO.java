import java.sql.SQLException;

 // fill the code
public interface IPurchaseOrderDAO{
    Long createPurchaseOrder(PurchaseOrder purchaseorderObj) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}