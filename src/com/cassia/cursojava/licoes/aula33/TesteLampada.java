package com.cassia.cursojava.licoes.aula33;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada("Bivolt", "A50", 7, "Amarela", "Amarela", 36, 5.99, args, false);
		
		lampada.setModelo("A60");
		
		lampada.setTipos(new String[] {"Abajur","Pendentes","Lumin�rias"});
		
		System.out.println("Modelo: " + lampada.getModelo());
		System.out.println("Tens�o: " + lampada.getTensao());
		System.out.println("Pot�ncia: " + lampada.getPotencia());
		System.out.println("Tipo Luz: " + lampada.getTipoLuz());
		System.out.println("Valor unit�rio: " + lampada.getPreco());
		
		lampada.imprimirTipos();		
		lampada.ligarLampada();		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		
	}

}
