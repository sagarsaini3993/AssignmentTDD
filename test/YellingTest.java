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
		String[] arr = {"Peter"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter is yelling", actualOutput);
	}
	
	
	@Test
	public void testNobodyIsYelling() {
		
		Yelling y = new Yelling();
		String[] arr = {""};
		String actualOutput = y.scream(arr);
		assertEquals("Nobody is yelling", actualOutput);
	}
	
	@Test
	public void testUppercaseYelling() {
		
		Yelling y = new Yelling();
		String[] arr = {"PETER"};
		String actualOutput = y.scream(arr);
		assertEquals("PETER IS YELLING", actualOutput);
	}
	
	@Test
	public void testTwoPeopleAreYelling() {
		
		Yelling y = new Yelling();
		String[] arr = {"Peter" , "Kadeem"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter and Kadeem are yelling", actualOutput);
	}
	
	@Test
	public void testMoreThanTwoPeopleAreYelling() {
		
		Yelling y = new Yelling();
		String[] arr = {"Peter" , "Kadeem" , "Albert"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter , Kadeem ,  and Albert are yelling", actualOutput);
	}

}
