package com.cassia.cursojava.licoes.aula33;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada("Bivolt", "A50", 7, "Amarela", "Amarela", 36, 5.99, args, false);
		
		lampada.setModelo("A60");
		
		lampada.setTipos(new String[] {"Abajur","Pendentes","Luminárias"});
		
		System.out.println("Modelo: " + lampada.getModelo());
		System.out.println("Tensão: " + lampada.getTensao());
		System.out.println("Potência: " + lampada.getPotencia());
		System.out.println("Tipo Luz: " + lampada.getTipoLuz());
		System.out.println("Valor unitário: " + lampada.getPreco());
		
		lampada.imprimirTipos();		
		lampada.ligarLampada();		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		
	}

}
