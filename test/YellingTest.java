import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOnePersonYelling() {
		
		Yelling y = new Yelling();
		String actualOutput = y.scream("Peter");
		assertEquals("Peter is yelling", actualOutput);
	}
	
	
	@Test
	public void testNobodyIsYelling() {
		
		Yelling y = new Yelling();
		String actualOutput = y.scream("");
		assertEquals("Nobody is yelling", actualOutput);
	}
	
	@Test
	public void testUppercaseYelling() {
		
		Yelling y = new Yelling();
		String actualOutput = y.scream("PETER");
		assertEquals("PETER IS YELLING", actualOutput);
	}

}
