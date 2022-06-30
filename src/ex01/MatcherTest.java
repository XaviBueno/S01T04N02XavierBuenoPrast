package ex01;



import org.junit.jupiter.api.Test;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;
class MatcherTest  {
	
	
	@Test
	
	public void tamanyEs8() {
		assertThat("mordor",length(is(8)));
	}

	

	public static Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "La longitud del  string ", "la longitud") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
	}
	
	

	
}


