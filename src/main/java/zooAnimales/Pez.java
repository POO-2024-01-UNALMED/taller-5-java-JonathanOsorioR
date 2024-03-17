package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal {
	
	private ArrayList<Pez> listado = new ArrayList<>();
	public int salmones = 0;
	public int bacalaos = 0;
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
	
	public Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez (nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public Pez crearBacalao (String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez (nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public static int cantidadPeces () {
		return totalPeces;
	}
	
	@Override
	public String movimiento() {
		super.movimiento();
		return "nadar";
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		this.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		this.bacalaos = bacalaos;
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
