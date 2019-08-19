public class TaxBO {
	public double calculateNetAmount(int choice,double amount) {
		if(choice==1) {
			return amount+(amount*(5.0d/100.0d));
		}
		else if(choice==2) {
			return amount+(amount*(3.0d/100.0d));
		}
		return -1;
	}
}