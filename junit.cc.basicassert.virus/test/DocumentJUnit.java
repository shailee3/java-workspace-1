import static org.junit.Assert.assertThat;
 import static org.hamcrest.CoreMatchers.*;
 
 import org.junit.After;
 import org.junit.Before;
 import org.junit.Test;

public class DocumentJUnit {

	private DocumentBO documentBO;
	private String word;

	@Before
	public void setUp() throws Exception {
		documentBO = new DocumentBO();
	}

	@After
	public void tearDown() throws Exception {
		documentBO = null;
	}

	@Test
	public void testFindVirus() {

		word = "JUnit is to perform unittesting";
		assertThat(documentBO.findVirus(word, "is"),containsString("is"));
		assertThat(documentBO.findVirus(word, "unittesting"),containsString("unittesting"));
		assertThat(documentBO.findVirus(word, "regression"),containsString(""));
	}

}
