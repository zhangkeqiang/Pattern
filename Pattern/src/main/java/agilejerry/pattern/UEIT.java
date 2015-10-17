package agilejerry.pattern;

public class UEIT {
	IEIT eit;
	public void setEIT(IEIT theeit){
		this.eit = theeit;
	}
	
	public void run(){
		if(eit != null){
			eit.run();
		}else{
			System.out.println("EIT is null");			
		}
	}
}
