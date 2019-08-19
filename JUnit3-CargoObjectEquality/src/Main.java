import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the cargo details :\nEnter the name :");
		String name = buff.readLine();
		System.out.println("Enter the description :");
		String desc = buff.readLine();
		System.out.println("Enter the length :");
		double length = Double.parseDouble(buff.readLine());
		System.out.println("Enter the width :");
		double width = Double.parseDouble(buff.readLine());
		Cargo cargo = new CargoBO().cargoDetails(name,desc,length,width);
		System.out.println("The cargo details are :");
		System.out.println("Name : "+cargo.getName()+" cm");
		System.out.println("Description : "+cargo.getDescription()+" cm"); 
		System.out.println("Length : "+cargo.getLength()+" cm"); 
		System.out.println("Width : "+cargo.getWidth()+" cm");
	}
}
