import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		String word;
		String virus;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the file content:");
		word = reader.readLine();
		System.out.println("Enter the virus keyword:");
		virus = reader.readLine();
		DocumentBO document = new DocumentBO();
		String virusInDocument = document.findVirus(word, virus);
		if (virusInDocument.isEmpty())
			System.out.println("No virus present");
		else
			System.out.println("Virus present");
	}

}