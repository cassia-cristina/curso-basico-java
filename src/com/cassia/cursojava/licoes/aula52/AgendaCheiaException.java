package com.cassia.cursojava.licoes.aula52;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "A agenda já está cheia!";
	}

}
