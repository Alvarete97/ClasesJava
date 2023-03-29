import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aeropuerto {

	/*--- VARIABLES --------------------------------------------------------*/
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public LocalDate fecha = LocalDate.now();
	public String fechaFormateada = fecha.format(dateTimeFormatter);
	
	// Otros datos por defecto que podrían llevar asociados cada vuelo
	
	public String origen = "Madrid";
	public String pista = "A20";
	public String dir_viento = "Sur";
	
	/*----------------------------------------------------------------------*/
	
	
	
	
}
