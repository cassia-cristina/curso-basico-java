package com.cassia.cursojava.licoes.aula24;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LivrosDeUmaBiblioteca {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();

		livro.nome = "A arte da Guerra";
		livro.autor = "Autor";
		livro.anoLancamento = 1999;
		livro.qtdPaginas = 1998;
		livro.isbn = "123-A155";
		
		livro.usuario = "Cassia";
		livro.emprestado = true;
		
		DateTimeFormatter dataformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Passando a data atual
		livro.dataEmprestimo = LocalDate.now();
		//Data de emprestimo + 5 dias:
		livro.dataEntrega = livro.dataEmprestimo.plusDays(5);
		//passando uma data fixa:
		//livro.dataEntrega = LocalDate.parse("2021-05-19");
		
		System.out.println(String.format("Olá %s! A data do seu empréstimo começa em: %s", livro.usuario, dataformat.format(livro.dataEmprestimo)));
		System.out.println("Data de devolução: " + dataformat.format(livro.dataEntrega));
		System.out.println("Nome: " + livro.nome);
		System.out.println("Ano de lançamento: " + livro.anoLancamento);
		System.out.println("ISBN: " + livro.isbn);
		System.out.println(String.format("Emprestado: %s", livro.emprestado ? "Sim":"Não"));
		
	}

}
