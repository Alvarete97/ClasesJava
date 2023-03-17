import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Fichero {

	String a;
	LocalDate fecha = LocalDate.now();
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMYYYY");
	String fechaFormateada = fecha.format(dateTimeFormatter);
	
	public void Escri(String x) {
		
		
		try {
			String ruta = "C:\\Users\\asalf\\eclipse-workspace\\Ejercicio2_Indra\\src\\info_empleados_"+ fecha +".txt";	
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
	
	public String Leer() {
		
			try {
				
				File doc = new File("C:\\Users\\asalf\\eclipse-workspace\\Ejercicio2_Indra\\src\\info_empleados_"+ fecha +".txt");
				BufferedReader obj = new BufferedReader (new FileReader(doc));
				String iter;
			
				while((iter = obj.readLine()) != null)
				a += " " + iter;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return a;
	};
	
}
