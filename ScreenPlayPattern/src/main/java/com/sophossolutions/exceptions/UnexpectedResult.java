package com.sophossolutions.exceptions;

public class UnexpectedResult extends AssertionError {

	/**
	 * 
	 */
	//Orden interno que genera la clase assertion
	//No genera nada pero se debe poner
	private static final long serialVersionUID = 1L;
	
	//Para que quede lista la excepción
	public UnexpectedResult (String message, Throwable cause) {
		//Inicializa la clase padre con 'super'
		//Le pasa el mensaje de error con 'message'
		//Le pasa la causa del error
		super(message, cause);
	}
}
