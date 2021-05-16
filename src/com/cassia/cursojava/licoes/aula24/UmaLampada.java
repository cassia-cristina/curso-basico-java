package com.cassia.cursojava.licoes.aula24;

public class UmaLampada {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		
		lamp.garantiaMeses = 36;
		lamp.cor = "Amarela";
		lamp.modelo = "A60";
		lamp.potencia = 7;
		lamp.tensao = "Bivolt";
		lamp.tipoLuz = "Amarela";
		
		lamp.tipos = new String[4];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[1] = "Lampeões";
		lamp.tipos[2] = "Pendentes";
		lamp.tipos[3] = "Luminárias";
				
		System.out.println(lamp.cor);
		System.out.println(lamp.modelo);
		System.out.println(lamp.potencia + "W");
		System.out.println(lamp.tipoLuz);
		//System.out.println(lamp.tipos[1]);
		
		for(String tipo : lamp.tipos) {
			System.out.println(tipo);
		}
		
	}

}

