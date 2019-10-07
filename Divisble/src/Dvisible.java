import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dvisible {

	public static void main(String[] args) throws IOException {
		
		boolean divisibleBy10 = false;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter numbers to find those divisble by 10");
		
		String s[] = new String[5];		
		int count = 0;
		for(int i=0; i<s.length;i++)
		{
			s[i]= String.valueOf(br.readLine());
		}
		
		for(int i=0; i<s.length;i++)
		{
			int temp = Integer.valueOf(s[i])/10;
			if(temp == 0)
			{
				divisibleBy10 = true;
				System.out.println(s[i]);
				count++;
				divisibleBy10 = false;
			}
			
		}
		
		if (count == 0)
		{
			System.out.println("None divisible by 10");
		}

	}

}
