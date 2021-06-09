package com.cassia.cursojava.aula30;

public class Carro {
	
	//Utilizando this
	
public String modelo;
	String marca;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro() { }

	public Carro(String modelo, String marca, int numPassageiros) {
		this.modelo = modelo;
		this.marca = marca;
		this.numPassageiros = numPassageiros;
		System.out.println("Contrutor com 3 parâmetros");
	}
	
	public Carro(String modelo, String marca) {
		this(modelo, marca, 11);
		System.out.println("Contrutor com 2 parâmetros");
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
