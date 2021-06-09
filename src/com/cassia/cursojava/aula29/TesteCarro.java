package com.cassia.cursojava.aula29;

public class TesteCarro {
	
	//Construtores

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiesta", "Ford", 5);
		
		//van.modelo = "Ducato";
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
				
		System.out.println(van.modelo);
		System.out.println(van.marca);
		System.out.println("Número de passageiros: " + van.numPassageiros);
		
		
		
	}

}
