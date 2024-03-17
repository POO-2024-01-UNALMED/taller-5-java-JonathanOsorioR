package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	
	private ArrayList<Ave> listado = new ArrayList <> ();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	public static int totalAve = 0; 
	public Ave () {
		listado.add(this);
		totalAve++;
		
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		
		this.colorPlumas = colorPlumas;
		totalAve++;
		listado.add(this);
	}
	 public static int cantidadAves() {
		 return totalAve;
	 }

	 @Override
		public String movimiento() {
			super.movimiento();
			return "volar";
		}
	 
	 public Ave crearHalcon(String nombre, int edad, String genero) {
		 halcones++;
		 return new Ave(nombre, edad,"montanas", genero, "cafe glorioso");
	 }
	 
	 public Ave crearAguila(String nombre, int edad, String genero) {
		 aguilas++;
		 return new Ave(nombre, edad,"montanas", genero, "blanco y amarillo");
     }

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static int getTotalAve() {
		return totalAve;
	}

	public static void setTotalAve(int totalAve) {
		Ave.totalAve = totalAve;
	}
	 
	 

}
