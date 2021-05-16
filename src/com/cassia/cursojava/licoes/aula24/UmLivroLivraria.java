package com.cassia.cursojava.licoes.aula24;

public class UmLivroLivraria {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "A arte da Guerra";
		livro.autor = "Autor";
		livro.anoLancamento = 1999;
		livro.qtdPaginas = 1999;
		livro.isbn = "123-A155";
		livro.preco = 112.99;
		
		System.out.println(livro.nome);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.isbn);
		System.out.println(livro.preco);
		
		
		
	}

}
