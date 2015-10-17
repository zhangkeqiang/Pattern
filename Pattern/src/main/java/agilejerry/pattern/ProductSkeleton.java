package agilejerry.pattern;

public abstract class ProductSkeleton implements Product {

	public void fly() {
		// TODO Auto-generated method stub

	}
	public int calc(){
		step1();
		return step2();
	}
	
	protected abstract void step1();
	protected abstract int step2();
	
}
