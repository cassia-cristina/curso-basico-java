package com.cassia.cursojava.aula27;

public class TesteCarro {
	
	//Introdução a métodos com parâmetros

	public static void main(String[] args) {

		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//usando metodo void
		van.exibirAutonomia();
		//usando metodo com retorno
		System.out.println("Autonomia: " + van.obterAutonomia());
		//usando metodo com parametro e retorno
		double qtdCombustivel = van.calcularCombustivel(10);
		System.out.println("Cálculo de combustível: " + qtdCombustivel);
		
		
	}

}
