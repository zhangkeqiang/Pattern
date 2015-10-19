package agilejerry.pattern;

public class SMSCenter {
	public static SMSSender createSMSSender(){
		return new HXSMSSender();		
	}
}
