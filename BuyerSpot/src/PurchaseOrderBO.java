import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderBO {

    PurchaseOrderDAO purchaseOrderDAO = new PurchaseOrderDAO();

	public Long createPurchaseOrder(List<Item> items, Integer[] quantity,
			String customerName, String mobileNumber, Date orderDate)
			throws InsufficientQuantityException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		// fill the code
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setCustomerName(customerName);
		purchaseOrder.setMobileNumber(mobileNumber);
		purchaseOrder.setOrderDate(orderDate);
		purchaseOrder.setCreatedDate(new Date());
		List<OrderLine> orderLineList = new ArrayList<OrderLine>();
		Double totalAmount = new Double(0);
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getAvailableQuantity() < quantity[i]) {
				throw new InsufficientQuantityException("Item "
						+ item.getName() + " is unavailable");
			}

			OrderLine orderLine = new OrderLine();
			orderLine.setItem(item);
			orderLine.setPrice(item.getPrice());
			orderLine.setPurchaseOrder(purchaseOrder);
			orderLine.setQuantity(quantity[i]);
			orderLineList.add(orderLine);
			totalAmount += item.getPrice();
			purchaseOrder.setOrderLineList(orderLineList);
			purchaseOrder.setTotalAmount(totalAmount);
			purchaseOrder.setNumberOfItems(items.size());
		}

		return purchaseOrderDAO.createPurchaseOrder(purchaseOrder);
	}
}