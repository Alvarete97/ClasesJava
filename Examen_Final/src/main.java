import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class main {
	
	
	public static void main(String[] args) 
	{
		
		/*--- VARIABLES para escribir luego ---------------------------------------*/
		String val_final_vuelo = "";
		
		/*-------------------------------------------------------------------------*/
		
		
		
		/*--- TRY CATCH para gestionar texto ---------------------------------------*/
		
		try {
			
			/*--- LEEMOS ARCHIVO ---------------------------------------------------*/
			
			File archivo = new File("C:\\Users\\asalf\\eclipse-workspace\\Examen_Final\\src\\TXT_VUELOS.txt");
			
			Scanner sc = new Scanner(archivo);
			List <Vuelos> flys= new ArrayList<>();
			
			sc.nextLine();
			
			/*--- CREAMOS LOS OBJETOS VUELO ------------------------------------------*/
			while(sc.hasNextLine()) {
				String lineas = sc.nextLine();
				Scanner lsc = new Scanner(lineas);
				flys.add(new Vuelos(lsc.next(),Integer.parseInt(lsc.next()),lsc.next(),Integer.parseInt(lsc.next()),lsc.next()));
			}
			
			//System.out.println(flys);
			
			/*--- VALOR FINAL POR VUELO ----------------------------------------------*/
			
			for(int i = 0; i < flys.size(); i++) 
			{
				val_final_vuelo += " " + flys.get(i).getNombre() + " valor final por vuelo:\n";
				val_final_vuelo += "\t" + flys.get(i).getValUnit() * flys.get(i).getNPasajero() + "\n";
				
			}
			
				//System.out.println(val_final_vuelo);
			/*------------------------------------------------------------------------*/
			
			/*--- DIAS DE DIFERENCIA -------------------------------------------------*/
				
			for(int i = 0; i < flys.size(); i++) 
			{
				val_final_vuelo += " " + flys.get(i).getNombre() + " días restantes para el vuelo:\n";
				val_final_vuelo += "\t" + flys.get(i).tiempoRestante()+ "\n";
					
			}
				
				//System.out.println(val_final_vuelo);
			/*------------------------------------------------------------------------*/
				
			/*---  SEGMENTACION ------------------------------------------------------*/
			for(int i = 0; i < flys.size(); i++) 
			{
				//System.out.println(flys.get(i).getTipo() + "\t" + (flys.get(i).getValUnit() * flys.get(i).getNPasajero()));
				//System.out.println(flys.get(i).getTipo() == "ECONOMICO");
				//System.out.println((flys.get(i).getTipo() == "ECONOMICO") && ((flys.get(i).getValUnit() * flys.get(i).getNPasajero()) >= 100));
			
				
				if((flys.get(i).getTipo().equals("ECONOMICO")) && ((flys.get(i).getValUnit() * flys.get(i).getNPasajero()) >= 100)) 
				{
					val_final_vuelo += " " + flys.get(i).getNombre() + " es RANTABLE \n";
					
				}else if((flys.get(i).getTipo().equals("ECONOMICO")) && ((flys.get(i).getValUnit() * flys.get(i).getNPasajero()) < 100))
				{
					val_final_vuelo += " " + flys.get(i).getNombre() + " NO es RANTABLE \n";
					
				}else if((flys.get(i).getTipo().equals("PREMIER")) && ((flys.get(i).getValUnit() * flys.get(i).getNPasajero()) >= 1500)) 
				{
					val_final_vuelo += " " + flys.get(i).getNombre() + " es RANTABLE \n";
					
				}else
				{
					val_final_vuelo += " " + flys.get(i).getNombre() + " NO es RANTABLE \n";
				}	
						
			}
			
				//System.out.println(val_final_vuelo);
			/*------------------------------------------------------------------------*/
				
				
			/*--- MONTO FINAL --------------------------------------------------------*/
				
				val_final_vuelo += " MONTO_FINAL: \n";
				int mF = 0;
				for(int i = 0; i < flys.size(); i++) 
				{
					mF += flys.get(i).getValUnit() * flys.get(i).getNPasajero();
				};
				val_final_vuelo += "\t" + mF;
				
				//System.out.println(val_final_vuelo);
				
			/*------------------------------------------------------------------------*/
				
				
			/*--- FICHERO FINAL ------------------------------------------------------*/
				Fichero f = new Fichero();
				f.Escritura(val_final_vuelo);
				
			/*------------------------------------------------------------------------*/
				
				
				
				
				
				
				
			/*------------------------------------------------------------------------*/
				
			
		
		}catch (IOException e) {
			e.printStackTrace();

		}
	}
}
