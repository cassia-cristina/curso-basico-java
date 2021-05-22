package com.cassia.cursojava.licoes.aula27;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.tipoLuz = "Amarela";
		lampada.cor = "Amarela";
		lampada.preco = 27.99;
		lampada.tipos = new String[3];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Pendentes";
		lampada.tipos[2] = "Lumin�rias";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Tens�o: " + lampada.tensao);
		System.out.println("Pot�ncia: " + lampada.potencia);
		System.out.println("Tipo Luz: " + lampada.tipoLuz);
		System.out.println("Valor unit�rio: " + lampada.preco);
		
		System.out.println("Tipos:");
		for(String tipo : lampada.tipos) {
			System.out.println(tipo);
		}
		System.out.println();
		
		lampada.ligarLampada();		
		lampada.mostrarEstado();
		
		//lampada.desligarLampada();		
		//lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
