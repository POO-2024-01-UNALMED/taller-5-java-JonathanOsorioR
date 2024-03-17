package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	public static int totalPeces = 0;
	
	public Pez () {
		totalPeces++;
		listado.add(this);
	}
	
	public Pez (String nombre, int edad, String habitat, 
			String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalPeces++;
		listado.add(this);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez (nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao (String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez (nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public static int cantidadPeces () {
		return totalPeces;
	}
	
	
	public String movimiento() {
		
		return "nadar";
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static void setTotalPeces(int totalPeces) {
		Pez.totalPeces = totalPeces;
	}
	
	

}
