public class DocumentBO {

	public String findVirus(String word, String virus) {
		if (word.trim().contains(virus.trim()))
			return virus.trim();
		else
			return "";
	}
}
