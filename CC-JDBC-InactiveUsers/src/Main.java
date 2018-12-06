import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of login attempts");
	int failedAttempts = Integer.parseInt(br.readLine());
	UserDAO userdao = new UserDAO();
	userdao.makeInActive(failedAttempts);
	
	
	ArrayList<User> userList = userdao.getInActiveUsers();
	System.out.println("Inactive user Details :");
	System.out.format("%-15s%-15s%-15s\n","Name","Address","Mobile Number");
	for(int i=0;i<userList.size();i++){
		System.out.format("%-15s%-15s%-15s\n",userList.get(i).getUsername(),userList.get(i).getAddress(),userList.get(i).getMobile_number());
	}
	
	}
}
