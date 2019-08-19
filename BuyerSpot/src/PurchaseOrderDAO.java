import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseOrderDAO implements IPurchaseOrderDAO// fill the code
{

    public Long createPurchaseOrder(PurchaseOrder purchaseOrderobj)
			throws SQLException, InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		// fill the code
		Connection con = DBUtils.getConnection();
		PreparedStatement psPurchaseOrder = con
				.prepareStatement("insert into purchase_order(order_date, created_date, number_of_items, total_amount,customer_name,mobile_number) values (?,?,?,?,?,?)");

		java.sql.Date orderDateSQL = new java.sql.Date(purchaseOrderobj
				.getOrderDate().getTime());
		java.sql.Date createDateSQL = new java.sql.Date(purchaseOrderobj
				.getCreatedDate().getTime());

		psPurchaseOrder.setDate(1, orderDateSQL);
		psPurchaseOrder.setDate(2, createDateSQL);
		psPurchaseOrder.setInt(3, purchaseOrderobj.getNumberOfItems());
		psPurchaseOrder.setDouble(4, purchaseOrderobj.getTotalAmount());
		psPurchaseOrder.setString(5, purchaseOrderobj.getCustomerName());
		psPurchaseOrder.setString(6, purchaseOrderobj.getMobileNumber());
		psPurchaseOrder.executeUpdate();

		long purchaseOrderId = 0L;
		ResultSet rs = psPurchaseOrder.getGeneratedKeys();
		while (rs.next()) {
			purchaseOrderId = rs.getLong(1);
		}

		for (OrderLine order : purchaseOrderobj.getOrderLineList()) {
			PreparedStatement psOrderLine = con
					.prepareStatement("insert into order_line (price, quantity, item_id, purchase_order_id) values (?,?,?,?)");
			psOrderLine.setDouble(1, order.getPrice());
			psOrderLine.setInt(2, order.getQuantity());
			psOrderLine.setLong(3, order.getItem().getId());
			psOrderLine.setLong(4, purchaseOrderId);
			psOrderLine.executeUpdate();

			PreparedStatement psUpdateItem = con
					.prepareStatement("update item set available_quantity = available_quantity - ? where id = ?");
			psUpdateItem.setLong(2, order.getItem().getId());
			psUpdateItem.setInt(1, order.getQuantity());
			psUpdateItem.executeUpdate();

		}

		return purchaseOrderId;
	}
}