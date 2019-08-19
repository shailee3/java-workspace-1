import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String wt = s.next();
		PhoneValidator pv = new PhoneValidator();
		if (pv.validatePhoneNumber(wt))
			System.out.println("Valid Phone Number");
		else
			System.out.println("Invalid Phone Number");
	}
}
