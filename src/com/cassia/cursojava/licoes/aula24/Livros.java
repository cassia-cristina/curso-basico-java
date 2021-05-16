package com.cassia.cursojava.licoes.aula24;

public class Livros {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.nome = "A arte da Guerra";
		livro.autor = "Autor";
		livro.anoLancamento = 1999;
		livro.qtdPaginas = 1999;
		livro.isbn = "123-A155";
		
		System.out.println(livro.nome);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.isbn);
		
	}

}
