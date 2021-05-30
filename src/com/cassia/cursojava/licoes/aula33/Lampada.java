package com.cassia.cursojava.licoes.aula33;

public class Lampada {
	
	private String tensao;
	private String modelo;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private double preco;
	private String[] tipos;	
	private boolean ligada;
	
	public Lampada() {
	}
	
	public Lampada(String tensao, String modelo, int potencia, String cor, String tipoLuz, int garantiaMeses,
			double preco, String[] tipos, boolean ligada) {
		super();
		this.tensao = tensao;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.preco = preco;
		this.tipos = tipos;
		this.ligada = ligada;
	}
	
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligarLampada() {
		setLigada(true);
	}
	
	public void desligarLampada() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("Lâmpada ligada!");
		} else {
			System.out.println("Lâmpada desligada!");
		}
	}

	public void mudarEstado() {
		if(isLigada()) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}
	
	public void imprimirTipos() {
		System.out.print("Tipos: ");
		for(String tipos : getTipos()) {
			System.out.print(tipos + " ");
		}
		System.out.println();
	}
	

}
