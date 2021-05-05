package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class TiposTriangulos {
		
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado 1:");
		double lado1 = scan.nextDouble();
		
		System.out.println("Informe a medida do lado 2:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Informe a medida do lado 3:");
		double lado3 = scan.nextDouble();
		
		boolean triangulo = false;
		
		// triangulo = a soma de dois lados � maior que o 3�
		
		if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			triangulo = true;
		} else {
			System.out.println("Os valores informados n�o formam um tri�ngulo");
		}
		
		//Equil�tero: 3 lados iguais;
		//Escaleno: 3 lados diferentes;
		//Is�sceles: 2 lados iguais;
		
		if((triangulo) && lado1 == lado2 && lado2 == lado3) {
			System.out.println("� um tri�ngulo Equil�tero");
		} else if((triangulo) && lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("� um tri�ngulo Escaleno");
		} else if((triangulo) && (lado1 == lado2 || lado2 == lado3 || lado3 == lado1)) {
			System.out.println("� um tri�ngulo Is�sceles");
		}


	}	
	

}
