package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class q4Tests {

	@Test
	public void testDollarSign() {
		String filename = "abcd$0041";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "abcdeA");
	}
	
	/*
	@Test 
	public void testBaseCase() {
		String filename = "[a-z0-9_. -]+";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "[a-z0-9_. -]+");
	}*/
	
	@Test
	public void testDollarSignAtEnd() {
		String filename = "abcd$002A";
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		assertEquals(test.idFromFilename(filename), "abcd*");
	}

}
