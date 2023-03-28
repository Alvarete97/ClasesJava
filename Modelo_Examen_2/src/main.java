import org.json.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
		
public class main {
			public static void main(String[] args) throws IOException 
			{
				
				/*--- "current_weather" HARCODEADAS ---------------------------------------------------*/
				double tM = 0.0;
				double tB = 0.0;
				/*-------------------------------------------------------------------------------------*/
				 
				String resultado = " ";
				
				
				/*--- MADRID --------------------------------------------------------------------------*/
				try {
					
				URL urlMdr = new URL ("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&current_weather=true&forecast_days=1");

				
				HttpURLConnection con = (HttpURLConnection) urlMdr.openConnection();
				con.connect();
				
				int tiempoDeRepuesta = con.getResponseCode();
					if (tiempoDeRepuesta != 200)
					{
						throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
					}
					
					else
					{
						
						/*--- LECTURA DE FICHERO -----------------------------------------------------*/
						// Aquí simplemente hace string
						
						StringBuilder infoM = new StringBuilder();
						Scanner sc = new Scanner(urlMdr.openStream());
						while (sc.hasNext())
						{
							infoM.append(sc.nextLine());
						}
						sc.close();	
						
						/*--- Lectura JSON -------------------------------------------------------*/
						JSONObject jsonMdr = new JSONObject(infoM.toString());
						JSONObject actualMdr = jsonMdr.getJSONObject("current_weather");
						tB = actualMdr.getDouble("temperature");
						
						if (tM >= 15) {
							resultado += "\t Condiciones climáticas en Madrid \n" + " Temperatura NO apta para sembrar \n \n \n";
						}else{
							resultado += "\t Condiciones climáticas en Berlin \n" + " Temperatura apta para sembrar \n \n \n";	
						}
						
						/*--- GENERAR LAS ORDENES DE ACTUACION ---------------------------------------*/
						
						
						
						
						
					}
					
				} catch (MalformedURLException e){e.printStackTrace();}
				
				/*--- END MADRID ----------------------------------------------------------------------*/
				
				
				/*--- BERLIN --------------------------------------------------------------------------*/
				
				try {
					
					URL urlBrl = new URL ("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&forecast_days=1");
					
					HttpURLConnection con = (HttpURLConnection) urlBrl.openConnection();
					con.connect();
					int tiempoDeRepuesta = con.getResponseCode();
						if (tiempoDeRepuesta != 200)
						{
							throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
						}
						else
						{
							StringBuilder infoB = new StringBuilder();
							Scanner sc = new Scanner(urlBrl.openStream());
							while (sc.hasNext())
							{
								infoB.append(sc.nextLine());
							}
							sc.close();	
							System.out.println(infoB);
							
							/*--- Lectura JSON -------------------------------------------------------*/
							JSONObject jsonBrl = new JSONObject(infoB.toString());
							JSONObject actualBrl = jsonBrl.getJSONObject("current_weather");
							tB = actualBrl.getDouble("temperature");
							
							if (tB >= 20) {
								resultado += "\t Condiciones climáticas en Berlin \n" + " Temperatura apta para producción \n \n \n";
							}else{
								resultado += "\t Condiciones climáticas en Berlin \n" + " Temperatura apta para mantenimiento \n \n \n";	
							}
						}
					} catch (MalformedURLException e){e.printStackTrace();}
				/*--- END BERLIN ----------------------------------------------------------------------*/
				
				
				System.out.println(resultado);
				Fichero f = new Fichero();
				f.generaTxt(resultado);
				
			}
	}

