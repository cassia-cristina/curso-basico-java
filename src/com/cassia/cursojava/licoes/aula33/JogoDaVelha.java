package com.cassia.cursojava.licoes.aula33;

public class JogoDaVelha {
	
	private char[][] tabuleiro;
	private int jogada;
	
	public JogoDaVelha() {
		tabuleiro = new char[3][3];
		jogada = 1;
	}

	public JogoDaVelha(char[][] tabuleiro, int jogada) {
		super();
		this.tabuleiro = tabuleiro;
		this.jogada = jogada;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	
	public boolean validarJogada(int linha, int coluna, char sinal) {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			System.out.println("Posição utilizada, tente novamente!");
			return false;
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogada++;
			return true;
		}

	}
	
	public void imprimirTabuleiro() {
		for(int i=0; i<tabuleiro.length; i++) {
			for(int j=0; j<tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
		
	}
	
	public boolean validarGanhador(char sinal) {
		if((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) ||
				(tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) ||
				(tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) ||					
				(tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) ||
				(tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) ||
				(tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) ||
				(tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) ||
				(tabuleiro[2][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[0][2] == sinal)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean vezJogador1() {
		if(jogada % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
	

}
