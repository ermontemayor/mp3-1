package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class q4Tests {

	@Test
	public void testDollarSign() {
		String filename = "abcd$efghi";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "abcdefghi");
	}
	
	@Test 
	public void testBaseCase() {
		String filename = "[a-z0-9_. -]+";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "[a-z0-9_. -]+");
	}
	
	@Test
	public void testDollarSignAtEnd() {
		String filename = "abcd$ef";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "abcdef");
	}

}
