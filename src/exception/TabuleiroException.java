package exception;

public class TabuleiroException extends Exception{
	
	public TabuleiroException(Throwable e){
		super(e);
	}
	
	public TabuleiroException(String message){
		super(message);
	}
}
