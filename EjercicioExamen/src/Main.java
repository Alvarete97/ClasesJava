import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void  main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos archivos quiere fusionar?");
		int fusion = sc.nextInt();
		Lector l = new Lector();
		l.Lectura(fusion);
		sc.close();
		
		System.out.println("Se cargarán los datos del nuevo archivo en el programa...");
		/* Se le pasará la ruta de lectura y se rellenarán los campos de los nuevos objetos dentro del SET<>*/
		/* Se realizará la reescritura de los datos */
		
		
	}
	
}
