package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona; 
	
	public Animal() {
		
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		
	 
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.getListado().size()+
				"\nAves: " + Ave.getListado().size()+
				"\nReptiles: " + Reptil.getListado().size()+
				"\nPeces: " + Pez.getListado().size()+
				"\nAnfibios: " + Anfibio.getListado().size();
	}
	
	public String movimiento () {
		return "desplazarse"; 

	}
	
	public String toString () {
		String mensaje;
		if (this.zona!=null && this.zona.getZoo()!=null) {
			mensaje = ", la zona en la que me ubico es " + this.zona.getNombre() +", en el " + this.zona.getZoo().getNombre();
		}
		
		else {
			mensaje = "";
		}
		
		return "Mi nombre es " + this.nombre + ",tengo una edad de " + this.edad + 
				", habito en " + this.habitat + " y mi genero es "+ this.genero + mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	
}
