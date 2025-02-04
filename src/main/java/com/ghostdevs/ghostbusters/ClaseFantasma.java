package com.ghostdevs.ghostbusters;

public enum ClaseFantasma
{
	CLASEI("Clase I - Manifestación menor",1), CLASEII("Clase II - Aparición móvil",2),
	CLASEIII("Clase III - Entidad inteligente",3), CLASEIV("Clase IV - Fantasma histórico",4),
    CLASEV("Clase V - Espíritu antropomorfo",5), CLASEVI("Clase VI - Espíritu demoníaco",6),
    CLASEVII("Clase VII - Entidad ultraterrena",7); 
	
	private String tipo;
	private int idClase;
	
	private ClaseFantasma (String tipo, int idClase){
		this.tipo = tipo;
		this.idClase = idClase;
	}

	public String getNombreClub() {
		return tipo;
	}

	public int getPuestoLiga() {
		return idClase;
	}	
	
}