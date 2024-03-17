package zooAnimales;


import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private ArrayList<Anfibio> listado = new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int totalAnfibio = 0;

	public Anfibio () {
		totalAnfibio++;
		listado.add(this);
	}
	
	public Anfibio (String nombre,
			int edad, String habitat, String genero, 
			String colorPiel, boolean 
			venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnfibio++;
	
		listado.add(this);
	}
	public static int getTotalAnfibio ( ) {
		return totalAnfibio;
	}
	
	@Override
	public String movimiento() {
		super.movimiento();
		return "saltar";
	}

}
