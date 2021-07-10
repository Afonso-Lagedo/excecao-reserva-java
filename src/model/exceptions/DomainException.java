package model.exceptions;

public class DomainException extends Exception{
	//classes de exceção obrigão ter uma versão
	private static final long serialVersionUID = 1L; //adicionada a versão padrão
	
	public DomainException (String msg) {
		super(msg);
	}
	
}
