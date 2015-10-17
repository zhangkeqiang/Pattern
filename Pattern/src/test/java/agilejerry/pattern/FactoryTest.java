package agilejerry.pattern;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {

	public void testCreateProduct() {
		//SimpleFactory factory = new SimpleFactory();
		//assertNotNull(factory);
		Product product = SimpleFactory.CreateProduct();
		assertNotNull(product);
		
	}

}
