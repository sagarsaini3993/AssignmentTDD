import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class YellingTest {
	
	Yelling y = new Yelling();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOnePersonYelling() {
		
		String[] arr = {"Peter"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter is yelling", actualOutput);
	}
	
	
	@Test
	public void testNobodyIsYelling() {
		
		String[] arr = {""};
		String actualOutput = y.scream(arr);
		assertEquals("Nobody is yelling", actualOutput);
	}
	
	@Test
	public void testUppercaseYelling() {
		
		String[] arr = {"PETER"};
		String actualOutput = y.scream(arr);
		assertEquals("PETER IS YELLING", actualOutput);
	}
	
	@Test
	public void testTwoPeopleAreYelling() {
		
		String[] arr = {"Peter" , "Kadeem"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter and Kadeem are yelling", actualOutput);
	}
	
	@Test
	public void testMoreThanTwoPeopleAreYelling() {
		
		String[] arr = {"Peter" , "Kadeem" , "Albert"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter , Kadeem ,  and Albert are yelling", actualOutput);
	}
	
	@Test
	public void testShoutingAtLot() {
		
		String[] arr = {"Peter" , "KADEEM" , "Albert"};
		String actualOutput = y.scream(arr);
		assertEquals("Peter , KADEEM ,  and Albert are yelling, So is KADEEM", actualOutput);
	}

}
