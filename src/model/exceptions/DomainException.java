package model.exceptions;

public class DomainException extends RuntimeException{//não obriga a tratar as exceções
	//classes de exceção obrigão ter uma versão
	private static final long serialVersionUID = 1L; //adicionada a versão padrão
	
	public DomainException (String msg) {
		super(msg);
	}
	
}
