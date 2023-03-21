import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fichero {

	String a;
	LocalDate fecha = LocalDate.now();
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMYYYY");
	String fechaFormateada = fecha.format(dateTimeFormatter);
	
	public void Escritura(String x) {
		
		
		try {
			String ruta = "C:\\Users\\asalf\\eclipse-workspace\\Ejercicio2_Indra\\src\\info_salarial_plantilla_"+ fecha +".txt";	
			a = x;
			File archivo = new File(ruta);
			
			
			if (!archivo.exists())
				{
					archivo.createNewFile();
				}
			
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(a);
			bw.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
	};
	
}
