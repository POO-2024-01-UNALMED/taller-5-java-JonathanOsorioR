package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<> ();
	
	public Zoologico() {
		this(null,null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
				
	}
	
	public int cantidadTotalAnimales() {
		return Animal.getTotalAnimales();
	}
	
	public void agregarZona(Zona nuevaZona) {
		zonas.add(nuevaZona);
		nuevaZona.setZoo(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
