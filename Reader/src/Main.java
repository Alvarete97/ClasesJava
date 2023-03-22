import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
		
public class Main {

	public static void main(String[] args) throws IOException 
	{
		try {
			
		URL url = new URL ("https://v2.jokeapi.dev/joke/Programming?lang=es&blacklistFlags=nsfw,religious,political,racist,sexist,explicit");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		
		int tiempoDeRepuesta = con.getResponseCode();
		if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
		}
		else
		{
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();
			System.out.println(informacion);
		}
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}	
	}
}
