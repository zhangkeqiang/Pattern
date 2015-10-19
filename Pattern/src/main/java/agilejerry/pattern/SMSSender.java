package agilejerry.pattern;

public abstract class SMSSender {

	public abstract void send(String string, String string2);
	
	public abstract void sendVerifyCode(String sPhone, String message);

}
