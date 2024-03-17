package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal {
	
	private ArrayList<Pez> listado = new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int totalPeces = 0;
	
	public Pez () {
		
	}
	
	public Pez (String nombre, int edad, String habitat, 
			String genero, ArrayList<Zona> zona, ArrayList<Pez> listado, int salmones,
			int bacalaos, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		totalPeces++;
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalPeces++;
	}
	
	public static int getTotalPeces () {
		return totalPeces;
	}
	
	@Override
	public String movimiento() {
		super.movimiento();
		return "nadar";
	}

}
