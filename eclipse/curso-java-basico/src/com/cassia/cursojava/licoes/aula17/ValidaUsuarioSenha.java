package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class ValidaUsuarioSenha {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
				
		boolean valida = false;
		
		do {
		
			System.out.println("Informe um nome de usuario:");
			String usuario = scan.next();
			
			System.out.println("Informe uma senha:");
			String senha = scan.next();
			
			if (usuario.equals(senha)) {
				valida = true;
				System.out.println("Nome de usuário e senha estão iguais!");
			} else {
				valida = false;
				System.out.println("As informações são válidas!");
			}
			
			
		} while (valida);
		
		
	}	
		
}
		