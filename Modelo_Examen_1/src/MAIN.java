import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class MAIN {

	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
	LocalDate fechaUlt;
	String fUlt = fechaUlt.format(dateTimeFormatter);


	public static void  main(String []args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		/*--- PRODUCTOS HARCODEADOS -------------------------------------------*/
		  Remera r = new Remera();
		  Camisa c = new Camisa();
		  Vestido v = new Vestido();
		  Pantalon p = new Pantalon();
		  Sweater s = new Sweater();
		
		r.setRopa("Remera");
		r.setPrecio(5);
		r.setCantidad(100);
		c.setRopa("Camisa");
		c.setPrecio(15);
		c.setCantidad(50);
		v.setRopa("Vestido");
		v.setPrecio(25);
		v.setCantidad(20);
		p.setRopa("Pantalon");
		p.setPrecio(20);
		p.setCantidad(10);
		s.setRopa("Sweater");
		s.setPrecio(15);
		s.setCantidad(5);
		
		/*---------------------------------------------------------------------*/
		
	
	
		List<Producto> listaCompra = new ArrayList<>();
		listaCompra.add(r);
		listaCompra.add(c);
		listaCompra.add(v);
		listaCompra.add(p);
		listaCompra.add(s);
		boolean bucle = true;
		while(bucle) {
			System.out.println("\n");
			System.out.println("Bienvenido a su tienda de ropa favorita");
			System.out.println("Elija que desea hacer hoy: ");
			System.out.println("1- Añadir prductos al almacén");
			System.out.println("2- Comprobar inventario del almacén");
			System.out.println("3- Cambiar alguno de los productos del almacén");
			System.out.println("4- Eliminar productos del almacén");
			System.out.println("\n");
			int eleccion = sc.nextInt();
			
			switch(eleccion) 
			{
			case(1):{
				
				System.out.println("Elija que producto desea añadir: ");
				System.out.println("1- Camisa");
				System.out.println("2- Pantalon");
				System.out.println("3- Remera");
				System.out.println("4- Sweater");
				System.out.println("5- Vestido");
				int e_ropa = sc.nextInt();
				
				
				switch(e_ropa) {
				case(1):{
					
					System.out.println("Elija que cantidad de " + c.getRopa()+ " deseas introducir");
					c.setCantidad(sc.nextInt());
					
				}break;
				case(2):{
					
					System.out.println("Elija que cantidad de " + p.getRopa()+ " deseas introducir");
					p.setCantidad(sc.nextInt());
					
					
				}break;
				case(3):{
					
					System.out.println("Elija que cantidad de " + r.getRopa()+ " deseas introducir");
					r.setCantidad(sc.nextInt());
					
					
				}break;
				case(4):{
					
					System.out.println("Elija que cantidad de " + s.getRopa()+ " deseas introducir");
					s.setCantidad(sc.nextInt());
					
					
				}break;
				case(5):{
					
					System.out.println("Elija que cantidad de " + v.getRopa()+ " deseas introducir");
					v.setCantidad(sc.nextInt());
						
				}break;
				default:{
					System.out.println("No ha elegido un producto de entre los posibles, lo sentimos");
					System.out.println("\n");
				}break;
				}
					
				
			}break;
			case(2):{
				
				System.out.println("El inventario actual del almacén es; ");
				System.out.println("El inventario actual del almacén es; ");
				 for (Producto prd : listaCompra) {
			            System.out.println(prd.getRopa()+ "\t" + prd.getPrecio()+ "\t" + prd.getCantidad() + "\t" + prd.getLastCompra() + "\n" );
			        }
				 System.out.println("La cantidad total de productos vendidos es");
				 System.out.println(c.get_cantidades() + p.get_cantidades() + r.get_cantidades() + s.get_cantidades() + c.get_cantidades() +" € totales");
				 System.out.println("\n");
			}break;
			case(3):{
				
				
				System.out.println("Elija que producto desea variar: ");
				System.out.println("1- Camisa");
				System.out.println("2- Pantalon");
				System.out.println("3- Remera");
				System.out.println("4- Sweater");
				System.out.println("5- Vestido");
				int e_ropa = sc.nextInt();
				
				
				switch(e_ropa) {
				case(1):{
					
					System.out.println("Que desea cambiar de " + c.getRopa());
					System.out.println(" 1- Cantidad \n 2- Precio \n cualquier otro número para salir");
					int elegir = sc.nextInt();
					
					if(elegir == 1) {
						
						System.out.println("Elija que cantidad TOTAL de " + c.getRopa()+ " deseas establecer");
						c.setCantidadTotal(sc.nextInt());
						
					}else if (elegir == 2) {
						System.out.println("Elija que nuevo precio le corrresponde a " + c.getRopa());
						c.setPrecio(sc.nextInt());
					}else {
						System.out.println("No se ha podido completar el cambio, lo sentimos");
						System.out.println("\n");
					}
	
					
				}break;
				case(2):{
					
					System.out.println("Que desea cambiar de " + p.getRopa());
					System.out.println(" 1- Cantidad \n 2- Precio \n cualquier otro número para salir");
					int elegir = sc.nextInt();
					
					if(elegir == 1) {
						
						System.out.println("Elija que cantidad TOTAL de " + p.getRopa()+ " deseas establecer");
						p.setCantidadTotal(sc.nextInt());
						
					}else if (elegir == 2) {
						System.out.println("Elija que nuevo precio le corrresponde a " + p.getRopa());
						p.setPrecio(sc.nextInt());
					}else {
						System.out.println("No se ha podido completar el cambio, lo sentimos");
						System.out.println("\n");
					}
	
					
				}break;
				case(3):{
					
					System.out.println("Que desea cambiar de " + r.getRopa());
					System.out.println(" 1- Cantidad \n 2- Precio \n cualquier otro número para salir");
					int elegir = sc.nextInt();
					
					if(elegir == 1) {
						
						System.out.println("Elija que cantidad TOTAL de " + r.getRopa()+ " deseas establecer");
						r.setCantidadTotal(sc.nextInt());
						
					}else if (elegir == 2) {
						System.out.println("Elija que nuevo precio le corrresponde a " + r.getRopa());
						r.setPrecio(sc.nextInt());
			
					}else {
						System.out.println("No se ha podido completar el cambio, lo sentimos");
						System.out.println("\n");
					}
					
				}break;
				case(4):{
					
					System.out.println("Que desea cambiar de " + s.getRopa());
					System.out.println(" 1- Cantidad \n 2- Precio \n cualquier otro número para salir");
					int elegir = sc.nextInt();
					
					if(elegir == 1) {
						
						System.out.println("Elija que cantidad TOTAL de " + s.getRopa()+ " deseas establecer");
						s.setCantidadTotal(sc.nextInt());
						
					}else if (elegir == 2) {
						System.out.println("Elija que nuevo precio le corrresponde a " + s.getRopa());
						s.setPrecio(sc.nextInt());
					}else {
						System.out.println("No se ha podido completar el cambio, lo sentimos");
						System.out.println("\n");
					}
					
				}break;
				case(5):{
					
					System.out.println("Que desea cambiar de " + v.getRopa());
					System.out.println(" 1- Cantidad \n 2- Precio \n cualquier otro número para salir");
					int elegir = sc.nextInt();
					
					if(elegir == 1) {
						
						System.out.println("Elija que cantidad TOTAL de " + v.getRopa()+ " deseas establecer");
						v.setCantidadTotal(sc.nextInt());
						
					}else if (elegir == 2) {
						System.out.println("Elija que nuevo precio le corrresponde a " + v.getRopa());
						p.setPrecio(sc.nextInt());
					}else {
						System.out.println("No se ha podido completar el cambio, lo sentimos");
						System.out.println("\n");
					}
						
				}break;
				default:{
					System.out.println("No ha elegido un producto de entre los posibles, lo sentimos");
					System.out.println("\n");
				}break;
				}
				
			}break;
			case(4):{
				
				System.out.println("¿Que producto desea eliminar?");
				System.out.println("1- Camisa");
				System.out.println("2- Pantalon");
				System.out.println("3- Remera");
				System.out.println("4- Sweater");
				System.out.println("5- Vestido");
				System.out.println("Otros - No eliminar");
				int e_ropa = sc.nextInt();
				
				
				switch(e_ropa) {
				case(1):{
					
					System.out.println("¿Seguro que desea eliminar " + c.getRopa()+ " del almacén?");
					if(sc.nextInt() == 1) {
						
						System.out.println("Se han eliminado las " + c.getRopa()+ "s del almacén");
						listaCompra.remove(c);
					}else {
						System.out.println("NO se han eliminado las " + c.getRopa()+ "s del almacén");
					}
					
				}break;
				case(2):{
					
					System.out.println("¿Seguro que desea eliminar " + p.getRopa()+ " del almacén?");
					if(sc.nextInt() == 1) {
						
						System.out.println("Se han eliminado las " + p.getRopa()+ "s del almacén");
						listaCompra.remove(p);
					}else {
						System.out.println("NO se han eliminado las " + p.getRopa()+ "s del almacén");
					}
					
					
				}break;
				case(3):{
					
					System.out.println("¿Seguro que desea eliminar " + r.getRopa()+ " del almacén?");
					if(sc.nextInt() == 1) {
						
						System.out.println("Se han eliminado las " + r.getRopa()+ "s del almacén");
						listaCompra.remove(r);
					}else {
						System.out.println("NO se han eliminado las " + r.getRopa()+ "s del almacén");
					}
					
					
				}break;
				case(4):{
					
					System.out.println("¿Seguro que desea eliminar " + s.getRopa()+ " del almacén?");
					if(sc.nextInt() == 1) {
						
						System.out.println("Se han eliminado las " + s.getRopa()+ "s del almacén");
						listaCompra.remove(s);
					}else {
						System.out.println("NO se han eliminado las " + s.getRopa()+ "s del almacén");
					}
					
					
					
				}break;
				case(5):{
					
					System.out.println("¿Seguro que desea eliminar " + v.getRopa()+ " del almacén?");
					if(sc.nextInt() == 1) {
						
						System.out.println("Se han eliminado las " + v.getRopa()+ "s del almacén");
						listaCompra.remove(v);
					}else {
						System.out.println("NO se han eliminado las " + v.getRopa()+ "s del almacén");
					}
					
						
				}break;
				default:{
					System.out.println("No ha elegido un producto de entre los posibles, lo sentimos");
					System.out.println("\n");
				}break;
				}
				
		
			}break;
			default:{
				
				System.out.println("No ha elegido una opcion de entre las posibles, lo sentimos");
				System.out.println("\n");
			}
			}
			
			System.out.println("¿Desea seguir realizando gestiones?");
			System.out.println("1 - NO \n cualquier otro número - SI");
			System.out.println("\n");
			if(sc.nextInt() == 1) {
				bucle = false;
			}
		}
		sc.close();
		
		/* AQUI SE GENERARARÍA EL TXT A MODO DE TICKET */
	}
	
}
