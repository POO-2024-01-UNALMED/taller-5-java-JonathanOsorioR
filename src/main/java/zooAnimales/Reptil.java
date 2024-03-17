package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	private Reptil [] listado;
	public int iguana;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
	
	}
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat,
			String genero, Zona[] zona, Reptil [] listado, int iguana, int serpientes,
			String colorEscamas, int largoCola) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado; this.iguana = iguana; this.serpientes = serpientes;
		this.colorEscamas = colorEscamas; this.largoCola = largoCola; // OK
		
	}
	
	

}
