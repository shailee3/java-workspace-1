import java.text.SimpleDateFormat;
import java.util.*;

public class ShipmentBO {
	public String generateEmailId(String name, Date dob )
	{
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy");
		StringBuilder email = new StringBuilder();
		String emailName[] = name.split(" ");
		for(String s : emailName)
			email.append(s.toLowerCase());
		String year = sdf .format(dob);
		email.append(year).append("@gmail.com");
		return email.toString();
	}
}
