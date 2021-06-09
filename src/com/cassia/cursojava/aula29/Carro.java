package com.cassia.cursojava.aula29;

public class Carro {
	
	//Construtores
	
	String modelo;
	String marca;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro() { }

	public Carro(String modelo, String marca, int numPassageiros) {
		this.modelo = modelo;
		this.marca = marca;
		this.numPassageiros = numPassageiros;
	}


	void exibirAutonomia() {
		System.out.println("A autonomia do carro - Modelo " + modelo + " - é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
	

}
