package agilejerry.pattern;

import junit.framework.TestCase;

public class EITTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStart() {
		EEIT eit = new TEIT();
		assertEquals(5, eit.run());
	}

	public void testRun() {
		EEIT eit = new TEIT();
		//eit.run();
	}

}
