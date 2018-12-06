public class InvoiceBO {
	public void displayUserDetailsByStatus(String status, Invoice[] invoiceArray) {
		for(int i=0; i<invoiceArray.length; i++) {
			Invoice inv = invoiceArray[i];
			if(inv.getStatus().toLowerCase().equals(status.toLowerCase())) {
				User customer = inv.getCustomer();
				System.out.println(customer.toString());
			}
		}
	}
	
	public double getTotalInvoiceValue(String userName, Invoice[] invoiceArray) {
		double total = 0;
		for(int i=0; i<invoiceArray.length; i++) {
			Invoice inv = invoiceArray[i];
			if(inv.getCreatedBy().equals(userName)) {
				total += inv.getTotal();
			}
		}
		return total;
	}
}