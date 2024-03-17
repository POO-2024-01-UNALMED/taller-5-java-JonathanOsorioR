package zooAnimales;

import java.util.ArrayList;


public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	public static int totalReptil = 0;
	
	public Reptil() {
		totalReptil++;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat,
			String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas; 
		this.largoCola = largoCola;
		totalReptil++;
		listado.add(this);
				
	}
	
	public static Reptil crearIguana (String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil (nombre, edad, "humedad", genero, "verde", 3);
		
	}
	
	
	public static Reptil crearSerpiente (String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
		
	}
	
    public String movimiento() {
		
		return "reptar";
	}
	
	public static int cantidadReptiles () {
		return totalReptil;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public int getIguana() {
		return iguanas;
	}

	public void setIguana(int iguana) {
		Reptil.iguanas = iguana;
	}

	public int getSerpientes() {
		return serpientes;
	}

	public void setSerpientes(int serpientes) {
		this.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static int getTotalReptil() {
		return totalReptil;
	}

	public static void setTotalReptil(int totalReptil) {
		Reptil.totalReptil = totalReptil;
	}
	
	

}
