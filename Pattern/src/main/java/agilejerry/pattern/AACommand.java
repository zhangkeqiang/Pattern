package agilejerry.pattern;

public class AACommand implements Command {
	
	private int II;
	public AACommand(int i){
		this.II = i;
	}
	
	public AACommand(){
		//add some fffffffffffff
		//dddd ffffffff
		this.II = 10;
	}
	public boolean execute() {
		System.out.println("AACommand"  + II);
		//change some in dev 
		//ffffffffffff
		return true;
	}

}
