import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) throws IOException{
		
		// fill the code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the generated booking id");
		String i= br.readLine();
		
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		
		if(pattern.matcher(i).matches())
		{
			System.out.println("Generated booking id is not valid");
		}
		
		else
		{System.out.println("Generated booking id is valid");}	
		
	}
}

