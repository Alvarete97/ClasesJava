import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero implements I_Fichero {

	public void Escritura(String n_txt) 
	{
		try {
			
			String ruta = "src\\Informe_Final.txt";
			File archivo = new File(ruta);
			
			
			if (!archivo.exists())
				{
					archivo.createNewFile();
				}
			
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(n_txt);
			bw.close();
			
			} catch (IOException e) {e.printStackTrace();}
	}
	
}
