package br.com.sebastiao.junior.exception;

public class OpcaoResultadoInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public OpcaoResultadoInvalidaException(String msg) {
		super(msg);
	}

}
