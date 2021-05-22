package com.cassia.cursojava.licoes.aula27;
import java.util.Scanner;

public class TesteJogoDaVelha {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogo = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			
			if(jogo.vezJogador1()) {
				System.out.println("Vez do jogador 1 (X)!");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2 (O)!");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(!jogo.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já utilizada, tente novamente!");
			}
			
			
			jogo.imprimirTabuleiro();
			
			if(jogo.validarGanhador('X')) {
				ganhou = true;
				System.out.println("Ganhador 1 ganhou!");
			} else if(jogo.validarGanhador('O')) {
				ganhou = true;
				System.out.println("Ganhador 2 ganhou!");
			} else if(jogo.jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida");
			}
		}
		
	} //fim do metodo
	
	static int valor (String tipoValor, Scanner scan) {
		int valor=0;
		boolean valorValida = false;
		while(!valorValida) {
			 System.out.println("Informe uma " + tipoValor + " (1, 2 ou 3):");
			 valor = scan.nextInt();
			 if(valor >= 1 && valor <= 3) {
				 valorValida = true;
			 } else {
				 System.out.println("Entrada inválida, tente novamente!");
			 }
		}//fim while
		valor--;
		return valor;
	}//fim do metodo

}
