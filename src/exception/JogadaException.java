package exception;

public class JogadaException extends Exception{
	
	public JogadaException(Throwable e){
		super(e);
	}
	
	public JogadaException(String message){
		super(message);
	}
}
