package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre; 
	private Zoologico zoo;
	private ArrayList <Animal> animales = new ArrayList<> ();
	
	public Zona () {
				
	}
	
	public Zona (String nombre, Zoologico zoo) {
		
		this.nombre = nombre;
		this.zoo = zoo;
		if(zoo != null) {
			zoo.agregarZona(this);
		}
		
	}
	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales (Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
		nuevoAnimal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	

}
