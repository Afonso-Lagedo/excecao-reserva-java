package model.exceptions;

public class DomainException extends RuntimeException{//n�o obriga a tratar as exce��es
	//classes de exce��o obrig�o ter uma vers�o
	private static final long serialVersionUID = 1L; //adicionada a vers�o padr�o
	
	public DomainException (String msg) {
		super(msg);
	}
	
}
