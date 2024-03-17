package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	
	private ArrayList<Mamifero> listado = new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	public static int totalMamiferos = 0;
	
	public Mamifero() {
	
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas) {
		
		super(nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas; 
		totalMamiferos++;
		
	}
	public static int getTotalMamiferos() {
		return totalMamiferos;
	}
	
	
	

}
