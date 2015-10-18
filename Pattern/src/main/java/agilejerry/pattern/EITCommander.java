package agilejerry.pattern;

public class EITCommander {
	//private EITContext eitContext;
	public static EITI createEITI(){
		return new EITIT();
	}
	
	public static EITContext getContext(){
		/*
		if(eitContext == null){
			eitContext = EITContext.getInstance();
		}
		return eitContext;
		*/
		return EITContext.getInstance();
	}

	public static EITE createEIT(){
		EITE eit = new EITT();
		eit.setContext(getContext());
		return eit;
	}
}
