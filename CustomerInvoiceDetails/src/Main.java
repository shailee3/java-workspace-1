import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of invoices :");
		int n = Integer.parseInt(buf.readLine());
		Invoice[] invoices = new Invoice[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the invoice " + (i+1) + " details :");
			String[] values = buf.readLine().split(",");
			User customer = new User(values[0], values[1], values[2]);
			invoices[i] = new Invoice(customer, Double.parseDouble(values[3]), values[4], values[5]);
		}
		
		System.out.println("Customer details with status cleared Invoices :");
		System.out.format("%-15s %-15s %-15s\n","Name","State","Country");
		
		InvoiceBO invoiceBO = new InvoiceBO();
		invoiceBO.displayUserDetailsByStatus("Cleared", invoices);
		
		System.out.println("Enter the Invoice creator name :");
		String creater = buf.readLine();
		double total = invoiceBO.getTotalInvoiceValue(creater, invoices);
		
		System.out.println("The total invoice value :");
		if(total != 0) {
			System.out.format("%.2f", total);
		} else {
			System.out.print("No invoice available");	
		}
	}
}
