package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<> ();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
				
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for(Zona zona : zonas) {
			total += zona.cantidadAnimales();
		}
		return total;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
		nuevaZona.setZoo(this);
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
