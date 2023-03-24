import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.json.*;
import java.io.FileReader;

public class Lector implements Reader{

	Set<Empleado> BD = new HashSet<>();
	
public void Lectura(int n_txt){
	
	FileReader reader;
	
	for (int i = 0; i< n_txt;i++) {
    
	try {
		reader = new FileReader("C:\\\\Users\\\\asalf\\\\eclipse-workspace\\\\EjercicioExamen\\\\src\\\\USUARIOS_" +(i + 1) );
		Object JsonOBJ = parser.parse(reader);
		JSONObject json = new JSONObject(reader);
		System.out.println(json);
		Escritura();
	
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
    
	}
	
}


public void Escritura() {
	
	/*
	 	Set<Empleado> empleados = new HashSet<>();
		empleados.add(a);
		empleados.add(b);
		empleados.add(c);
		empleados.add(d);
		
		String SEmpleados = "";
		for(Empleado empleado: empleados)
		{
			SEmpleados += " Nombre: " + empleado.getNombre() +  " Apellido: " + empleado.getApellido() + " Localidad " + empleado.getLocalidad() + " Posicion: " + empleado.getPosicion() + " DNI: " + empleado.getDNI() + " Sueldo: " + empleado.getSueldo() +  "Fecha nacimiento: " + empleado.getNac() + " Edad: " + empleado.getEdad() + "Antiguedad: " + empleado.getOld() + ". " ;
		}
		Fichero f = new Fichero();
		f.Escritura(SEmpleados);
		
		
		
		
		
	  */
	
	try {
		String ruta_esc = "C:\\\\Users\\\\asalf\\\\eclipse-workspace\\\\EjercicioExamen\\\\src\\\\USUARIOS_Final";	
		String a = BD.toString();
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
	
	
};
}
