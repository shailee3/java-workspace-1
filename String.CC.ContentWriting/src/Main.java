import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the content");
		String input = br.readLine();
		String output = "";
		
		String token1 = "^&#";
		String token2 = "~@$";
		
		StringTokenizer st = new StringTokenizer(input, token1);
		
		output = st.nextToken();
		
		while(st.hasMoreTokens()) {
			output += " " + st.nextToken();
		}
		
		st = new StringTokenizer(output, token2);
		
		output = st.nextToken();
		
		while(st.hasMoreTokens()) {
			output += "\n" + st.nextToken();
		}
		
	    System.out.println("Formatted Content");
	    System.out.println(output);
	}
}

