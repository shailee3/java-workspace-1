
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name,dob;
		name = br.readLine();
		dob = br.readLine();
		Date date = sdf.parse(dob);
		ShipmentBO shipmentBO = new ShipmentBO();
		String email = shipmentBO.generateEmailId(name, date);
		System.out.println(email);
	}
}
