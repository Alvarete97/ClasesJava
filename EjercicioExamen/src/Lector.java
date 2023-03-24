import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Lector implements Reader{

	String a;
	String rSalida = "C:\\Users\\asalf\\eclipse-workspace\\EjercicioExamen\\src\\USUARIOS_Final.txt";
	
public void Lectura(int n_txt) {
	
	for (int i = 0; i< n_txt;i++) 
	{
		String rLectura = "C:\\Users\\asalf\\eclipse-workspace\\EjercicioExamen\\src\\USUARIOS_" + (i+1)+".txt";
		
		/* Realiza un bucle por la cantidad de textos a resumir y que viene desde el main*/
		
		
	}
	
	/*   Realiza la llamada al método de escritura el cual accede al array de elementos del programa 
	 * los imprime n eel fichero final*/
	
	Escritura(a, rSalida);
}
public String Lectura (String rL) {
	/* Leerá desde la ruta pedida y extraerá los datos al string para que se procesen como datos*/
	return a;
}
public void Escritura(String a, String r) {

	try {
		String ruta_esc = r;	
		File archivo = new File(ruta_esc);
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
}



}
