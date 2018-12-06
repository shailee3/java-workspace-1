import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice code");
		String i = br.readLine();
		
		StringBuilder s1 = new StringBuilder(i);
		
		//for(int index=0; index<8; index++) {
		//}
		
		String sub= s1.substring(0,2);			
		String i1;	
		
		if(sub.contains("CU"))
		{
			i1= s1.replace(0, 2, "CUR").toString();
			System.out.println(i1);
		}
		
		else if(sub.contains("AT"))
		{
			i1= s1.replace(0, 2, "AGT").toString();
			System.out.println(i1);
		}
		
		else if(sub.contains("CY"))
		{
			i1= s1.replace(0, 2, "CMY").toString();
			System.out.println(i1);
		}
		
		int len=s1.length();				
	}
}

