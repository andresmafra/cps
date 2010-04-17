package br.iteratorsystems.cps.exceptions;

public class FindAddressException extends Throwable{

	private static final long serialVersionUID = -7011440856483794439L;
	
	public FindAddressException(String message,Throwable cause){
		super(message,cause);
	}
	
	public FindAddressException(String message){
		super(message);
	}
	
	public FindAddressException(Throwable cause){
		super(cause);
	}
}
