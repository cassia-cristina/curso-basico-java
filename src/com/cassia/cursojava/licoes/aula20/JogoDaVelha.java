package com.cassia.cursojava.licoes.aula20;
import java.util.Scanner;

public class JogoDaVelha {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		char[][] tabuleiro = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			
			if(jogada % 2 == 1) { //jogador 1
				System.out.println("Vez do jogador 1 (X)!.");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2 (O)!");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			
			while(!linhaValida) {
				 System.out.println("Informe uma linha (1, 2 ou 3):");
				 linha = scan.nextInt();
				 if(linha >= 1 && linha <= 3) {
					 linhaValida = true;
				 } else {
					 System.out.println("Entrada inválida, tente novamente!");
				 }
			}
			
			boolean colunaValida = false;
			
			while(!colunaValida) {
				 System.out.println("Informe uma coluna (1, 2 ou 3):");
				 coluna = scan.nextInt();
				 if(coluna >= 1 && coluna <= 3) {
					 colunaValida = true;
				 } else {
					 System.out.println("Entrada inválida, tente novamente!");
				 }
			}
			
			linha--;
			coluna--;
			if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Posição utilizada, tente novamente!");
			} else {
				tabuleiro[linha][coluna] = sinal;
				jogada++;
			}
			
			//imprimindo o tabuleiro
			for(int i=0; i<tabuleiro.length; i++) {
				for(int j=0; j<tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
			}
			
			if((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
					(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') ||
					(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') ||					
					(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') ||
					(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') ||
					(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') ||
					(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') ||
					(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X')) {
				ganhou = true;
				System.out.println("Ganhador 1 ganhou!");
			} else if((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||
					(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') ||
					(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') ||					
					(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') ||
					(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') ||
					(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') ||
					(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') ||
					(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O')) {
				ganhou = true;
				System.out.println("Ganhador 2 ganhou!");
			} else if(jogada > 9) {
				ganhou = true;
				System.out.println("Empate!");
			}
			
		}//fim do primeiro while
		
		
		
	}

}
