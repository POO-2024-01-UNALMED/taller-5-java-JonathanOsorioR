package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private ArrayList<Anfibio> listado = new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int totalAnfibio = 0;

	public Anfibio () {
		
	}
	
	public Anfibio (String nombre,
			int edad, String habitat, String genero, 
			/*ArrayList<Zona> zona, int ranas,
			int salamandras,*/ String colorPiel, boolean 
			venenoso) {
		super(nombre, edad, habitat, genero, zona);
		//this.listado = listado; this.ranas = ranas; this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnfibio++;
		
	}
	public static int getTotalAnfibio ( ) {
		return totalAnfibio;
	}
	
	@Override
	public String movimiento() {
		super.movimiento();
		return "saltar";
	}

}
