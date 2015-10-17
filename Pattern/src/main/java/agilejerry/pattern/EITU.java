package agilejerry.pattern;

public class EITU {
	EITI eit;
	public void setEIT(EITI theeit){
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
