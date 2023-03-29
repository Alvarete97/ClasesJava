import java.time.LocalDate;

public class Vuelos extends Aeropuerto{

	/*--- VARIABLES --------------------------------------------------------*/
	private String nombre, tipo;
	private int pasajeros, valor_unit;
	
	private LocalDate f_vuelo = LocalDate.now();
	private String f_Vuelo = f_vuelo.format(dateTimeFormatter);
	/*----------------------------------------------------------------------*/
	
	
	/*--- CONSTRUCTOR ------------------------------------------------------*/
	public Vuelos(String a, int b, String c, int d, String e) {
		
		this.nombre = a;
		this.pasajeros = b;
		this.tipo = c;
		this.valor_unit = d;
		this.f_Vuelo = e;
		this.f_vuelo = LocalDate.parse(e,dateTimeFormatter);
		
	}
	/*----------------------------------------------------------------------*/
	
	
	/*--- GETTERS ----------------------------------------------------------*/
	
	public String getNombre() {return nombre;}
	public int getNPasajero() {return pasajeros;};
	public String getTipo() {return tipo;};
	public int getValUnit() {return valor_unit;};
	public String getFechaV() {return f_Vuelo;};
	public int tiempoRestante() 
	{
		int FAct = (fecha.getYear()*365)+(fecha.getMonthValue()*30)+ fecha.getDayOfMonth();
		int FNac = (f_vuelo.getYear()*365)+(f_vuelo.getMonthValue()*30)+ f_vuelo.getDayOfMonth();
		return (FAct - FNac);
	};
	
	/*----------------------------------------------------------------------*/
	
	
	
	/*--- SETTERS ----------------------------------------------------------*/
	/*----------------------------------------------------------------------*/
}
