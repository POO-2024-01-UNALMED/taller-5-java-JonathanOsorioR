package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	
	private ArrayList<Ave> listado = new ArrayList <> ();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public static int totalAve = 0; 
	public Ave () {
		
	}

	public Ave(String nombre, int edad, String habitat, 
			String genero, ArrayList<Zona> zona, ArrayList<Ave> listado, int halcones, int aguilas,
			String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
		totalAve++;
		
	}
	 public static int getTotalAve() {
		 return totalAve;
	 }

	 @Override
		public String movimiento() {
			super.movimiento();
			return "volar";
		}

	}
