import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
	
	public static String fecha() 
	{
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String fechaFormateada = fecha.format(dateTimeFormatter);
		
		return fechaFormateada;
	};
	
	

	
	
	
	public static void  main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		//Bienvenida y fecha
		System.out.println("Hola y bienvenide a este programa de recomendaciones");
		System.out.println("Hoy es " + fecha());
		System.out.println();
		System.out.println("¿Podría indicarme cual es su nombre?");
		p.setNombre(sc.next());
		
		//Mostrar los moods y la comprobación
		System.out.println("Bienvenide " + p.getNombre());
		System.out.println("¿Me podría indicar como se encuentra hoy?");
		System.out.println();
		System.out.println("Escriba el número correspondiente a su estado de ánimo");
		System.out.println("¿Me podría indicar como se encuentra hoy?");
		System.out.println("1- Enojado");
		System.out.println("2- Triste");
		System.out.println("3- Feliz");
		System.out.println("4- Preocupado");
		System.out.println("5- Aburrido");
		System.out.println("6- Somnoliento");
		System.out.println();
		
		int mood = sc.nextInt();
		
		/* VALIDADOR TOCA PELOTAS
		while((mood < 7) || (mood > 0)) {
			System.out.println("Por favor, estado de ánimo no válido, introduzca un estado de ánimo de la lista anterior.");
			mood = sc.nextInt();
		}
		*/
		p.setAnimo(mood);
		sc.close();
		
		
		//Asignación de diagnóstico
		switch (p.getEstaddo()) {
		case(1):{
			System.out.println("Le recomendamos haga yoga, para aliviar su estado de humor");
		}break;
		case(2):{
			System.out.println("Le recomendamos coma helado o chocolate");
		}break;
		case(3):{
			System.out.println("Le recomendamos siga así, recuerde hidratarse");
		}break;
		case(4):{
			System.out.println("Le recomendamos que no se preocupe, recuerde Hakuna Matata");
		}break;
		case(5):{
			System.out.println("Le recomendamos reirse, para ello le contaremon un chiste");
			int chiste = (int)(Math.random()*3+1);
			switch (chiste) 
			{
			case(1):{System.out.println("¿Cuál es el último animal que subió al arca de Noé? El del-fin.");}break;
			case(2):{System.out.println("¿Cuál es el colmo de Aladdín? Tener mal genio");}break;
			case(3):{System.out.println("Sí los zombies se deshacen con el paso del tiempo ¿zombiodegradables?");}break;
			default:{System.out.println("Van dos y se cae el del medio");}break;
			}
			System.out.println();
			System.out.println("Espero le hayamos entretenido");
			System.out.println();
		}break;
		case(6):{
			System.out.println("Le recomendamos se tome un café o infusión");
		}break;
		};
		
		//Despedida
		System.out.println();
		System.out.println();
		System.out.println("Le agradecemos que haya confiado en nuestros servicios " + p.getNombre());
		System.out.println("Esperamos verle muy pronto");
		
		}
	}
	
