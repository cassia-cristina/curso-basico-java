package com.cassia.cursojava.licoes.aula13;
import java.util.Scanner;

public class MostraNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int numero =  scan.nextInt();
		System.out.println("O n�mero informado foi: " + numero);
		

	}

}
