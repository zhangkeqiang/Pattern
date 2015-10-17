package agilejerry.pattern;

import junit.framework.TestCase;

public class ProductTest extends TestCase {
	Product p;
	protected void setUp() throws Exception {
		
		p = SimpleFactory.CreateProduct();
		super.setUp();
	}
	public void testFly() {		    
		p.fly();
		assertTrue(true);
	}
	
	public void testCalc(){		
		assertEquals(p.calc(), 122);
	}
}
