import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int msc = scan.nextInt();
		int cosco = scan.nextInt();
		int em = scan.nextInt();
		ShipmentBO shipmentBO = new ShipmentBO();
		shipmentBO.getMinimalCost(msc, cosco, em);
		System.out.println(new ShipmentBO().getMinimalCost(msc, cosco, em));
	}
}