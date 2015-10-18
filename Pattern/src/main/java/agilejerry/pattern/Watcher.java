package agilejerry.pattern;

public abstract class Watcher {
	protected String Name="Anonymous";
	public abstract void update(String str);
	public void setName(String thename){
		Name = thename; 
	}
}

