import org.json.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Main {

	
	public static void main(String[] args) throws IOException 
	{
		
		
		try {
			
			/* Obtener la respuesta de la API*/
			
			URL url = new URL ("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int tiempoDeRepuesta = con.getResponseCode();
			
			if (tiempoDeRepuesta != 200)
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			}
			else
			{
				/* Lectura de los datos */
				StringBuilder gatitos = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					gatitos.append(sc.nextLine());
				}
				sc.close();	
				
				
				/* Adaptar los datos*/
				
				//System.out.println(gatitos);  Debug
				
				JSONArray data = new JSONArray(gatitos.toString());
				JSONObject gato = data.getJSONObject(0);
				
				URL urlImg = new URL(gato.getString("url"));
				int w = (int)(gato.get("width"))+ 50;
				int h = (int)(gato.get("height"))+ 50;
				
				/* Referenciar la imagen */
				
				Image image = ImageIO.read(urlImg);
				ImageIcon imageIcon = new ImageIcon(image);
				
				/* Crear la ventana */
				JFrame jFrame = new JFrame();
				jFrame.setBackground(Color.blue);
				System.out.println(jFrame.getBackground());
				JLabel jLabel = new JLabel();
				
				/*Diseño de la ventana*/

				jFrame.setLayout(new FlowLayout());
				jFrame.setSize(w, h);
				jLabel.setIcon(imageIcon);
				jFrame.add(jLabel);
				jFrame.setIconImage(image);
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
			
			}
		}catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}