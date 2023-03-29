
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
	
	
	public static void main(String[] args) 
	{
		
		/*--- VARIABLES --------------------------------------------------------------*/
		String val_final_vuelo = "";
		List <Vuelos> flys= new ArrayList<>();
		Fichero f = new Fichero();
		/*----------------------------------------------------------------------------*/
		
		
		try {
			
			/*--- LEEMOS ARCHIVO -----------------------------------------------------*/
			File archivo = new File("src\\TXT_VUELOS.txt");
			Scanner sc = new Scanner(archivo);
			sc.nextLine();
			/*------------------------------------------------------------------------*/
			
			
			/*--- CREAMOS LOS OBJETOS VUELO ------------------------------------------*/
			while(sc.hasNextLine()) {
				String lineas = sc.nextLine();
				Scanner lsc = new Scanner(lineas);
				flys.add(new Vuelos(lsc.next(),Integer.parseInt(lsc.next()),lsc.next(),Integer.parseInt(lsc.next()),lsc.next()));
				
				if(sc.hasNext() == false) {
					lsc.close();
				}
			}
			sc.close();
			/*------------------------------------------------------------------------*/
			
			
			/*--- VALOR FINAL POR VUELO ----------------------------------------------*/
			
			for(int i = 0; i < flys.size(); i++) 
			{
				Operaciones o = new Operaciones();
				val_final_vuelo += " " + flys.get(i).getNombre()+ "-"+ flys.get(i).getTipo() + " valor final por vuelo:\n";
				val_final_vuelo += "\t" + o.valorFV(flys.get(i)) + "\n";
				
			}
			/*------------------------------------------------------------------------*/
			
			
			/*--- DIAS DE DIFERENCIA -------------------------------------------------*/
				
			for(int i = 0; i < flys.size(); i++) 
			{
				Operaciones o = new Operaciones();
				val_final_vuelo += o.valorFinalV(flys.get(i));	
			}
			/*------------------------------------------------------------------------*/
				
			
			/*---  SEGMENTACION ------------------------------------------------------*/
			for(int i = 0; i < flys.size(); i++) 
			{
				Operaciones o = new Operaciones();
				o.segmentacion(flys.get(i));			
			}
			/*------------------------------------------------------------------------*/
				
				
			/*--- MONTO FINAL --------------------------------------------------------*/
				
				val_final_vuelo += " MONTO_FINAL: \n";
				int mF = 0;
				for(int i = 0; i < flys.size(); i++) 
				{
					Operaciones o = new Operaciones();
					mF += o.valorFV(flys.get(i));
				};
				
				val_final_vuelo += "\t" + mF;
				
			/*------------------------------------------------------------------------*/
				
				
				
			/*--- FICHERO FINAL ------------------------------------------------------*/
				f.Escritura(val_final_vuelo);	
			/*------------------------------------------------------------------------*/
				
			
				
			/*--- FIN ----------------------------------------------------------------*/	
				System.out.print("La ejecución del progarma ha finalizado con exito");	
			/*------------------------------------------------------------------------*/
	
		
		}catch (IOException e) {
			e.printStackTrace();

		}
	}
}
