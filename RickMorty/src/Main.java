import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		
		/*-------------------------------- CHARACTER ----------------------------------*/
		try {
			
		URL url = new URL ("https://rickandmortyapi.com/api/character");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		
		int tiempoDeRepuesta = con.getResponseCode();
		if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
		}
		else
		{
			System.out.println("-----------------------------------------------------------");
			System.out.println("------------------------ CHARACTER ------------------------");
			System.out.println("-----------------------------------------------------------");
			System.out.println(" ");
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();
			System.out.println(informacion);
			System.out.println(" ");
		}
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		/*-------------------------------- LOCATION ----------------------------------*/
		
		try {
			
			URL url = new URL ("https://rickandmortyapi.com/api/location");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int tiempoDeRepuesta = con.getResponseCode();
			if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			}
			else
			{
				System.out.println("-----------------------------------------------------------");
				System.out.println("------------------------- LOCATION ------------------------");
				System.out.println("-----------------------------------------------------------");
				System.out.println(" ");
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();
				System.out.println(informacion);
				System.out.println(" ");
			}
			
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
		
		/*-------------------------------- EPISODE ----------------------------------*/
		
		try {
			
			URL url = new URL ("https://rickandmortyapi.com/api/episode");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int tiempoDeRepuesta = con.getResponseCode();
			if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			}
			else
			{
				System.out.println("-----------------------------------------------------------");
				System.out.println("------------------------- EPISODE -------------------------");
				System.out.println("-----------------------------------------------------------");
				System.out.println(" ");
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();
				System.out.println(informacion);
				System.out.println(" ");
			}
			
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
	
	
	
}
