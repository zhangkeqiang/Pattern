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
		EITE eit = new EITT();
		assertEquals(5, eit.run());
	}

	public void testRun() {
		EITI eit = new EITIT();
		eit.run();
	}
	
	

}
