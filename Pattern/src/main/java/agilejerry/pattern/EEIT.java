package agilejerry.pattern;

public abstract class EEIT {

	public int run(){
		return run1() + run2();
	}
	

	abstract protected int run1();
	abstract protected int run2();
}
