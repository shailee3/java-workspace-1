import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Transaction type :\n1.Credit card\n2.Cheque\nEnter your choice :");
		int choice = Integer.parseInt(buff.readLine());
		System.out.println("Enter the transaction amount :");
		double amount = Double.parseDouble(buff.readLine());
		double total = new TaxBO().calculateNetAmount(choice, amount);
		if(total!=-1)
			System.out.printf("Net amount : %.2f",Double.valueOf(total));
		else	
			System.out.println("Invalid Input");
	}
}