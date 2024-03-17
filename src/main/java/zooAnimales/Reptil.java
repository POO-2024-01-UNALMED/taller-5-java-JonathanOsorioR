package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado = new ArrayList<>();
	public int iguanas = 0;
	public int serpientes = 0;
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
	
	public Reptil crearIguana (String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil (nombre, edad, "humedad", genero, "verde", 3);
		
	}
	
	public Reptil crearSerpiente (String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
		
	}
	
	public static int cantidadReptiles () {
		return totalReptil;
	}

	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public int getIguana() {
		return iguanas;
	}

	public void setIguana(int iguana) {
		this.iguanas = iguana;
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
