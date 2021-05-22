package com.cassia.cursojava.aula27;

public class Carro {
	
	String modelo;
	String marca;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro - Modelo " + modelo + " - �: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
	
}

