package exceptiondemos;

public class InvalidProductPriceException extends RuntimeException{
	public InvalidProductPriceException(String msg) {
		super(msg);
	}

}
