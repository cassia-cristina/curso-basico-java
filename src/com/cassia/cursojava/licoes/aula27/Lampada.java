package com.cassia.cursojava.licoes.aula27;

public class Lampada {
	
	String tensao;
	String modelo;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	double preco;
	String[] tipos;
	
	boolean ligada;
	
	
	void ligarLampada() {
		ligada = true;
	}
	
	void desligarLampada() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("L�mpada ligada!");
		} else {
			System.out.println("L�mpada desligada!");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}
	

}
