package agilejerry.pattern;

public class AACommand implements Command {
	private int II;
	public AACommand(int i){
		this.II = i;
	}
	
	public AACommand(){
		//add some
		this.II = 10;
		//change some
	}
	public boolean execute() {
		System.out.println("AACommand"  + II);
		return true;
	}

}
