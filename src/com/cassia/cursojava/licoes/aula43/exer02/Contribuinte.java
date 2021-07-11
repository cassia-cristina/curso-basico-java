package com.cassia.cursojava.licoes.aula43.exer02;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public Contribuinte() { }
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", rendaBruta=" + rendaBruta + "]";
	}
	
}
