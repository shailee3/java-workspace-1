import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class EqualityCheck extends TypeSafeMatcher<Double> {

	private Double value;
	
	public EqualityCheck(Double value) {
		this.value = value;
	}
	
	@Override
	public void describeTo(Description description) {
		description.appendText("profit is").appendValue(this.value);
	}
	
	@Override
	public void describeMismatchSafely(Double item, Description description) {
		description.appendText("the actual profit was").appendValue(item);
	}

	@Override
	protected boolean matchesSafely(Double result) {
		return result.equals(this.value);
	}
}