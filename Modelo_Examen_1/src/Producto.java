import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto implements Product{

	
	/* --- DATOS --------------------------------------------------------*/
	String tipo_ropa;
	int cantidad, precio;
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
	LocalDate fechaUlt = LocalDate.now();
	LocalDate fechaAct = LocalDate.now();
	
	String fAct = fechaAct.format(dateTimeFormatter);
	String fUlt = fechaUlt.format(dateTimeFormatter);
	
	/* ------------------------------------------------------------------*/
	

	/* --- GETERS -------------------------------------------------------*/
	
	public String getRopa() {return tipo_ropa;};
	public int getPrecio() {return (int)(precio * 0.79);};
	public int getCantidad() {return cantidad;};
	public int getLastCompra() 
	{
		int FAct = (fechaAct.getYear()*365)+(fechaAct.getMonthValue()*30)+ fechaAct.getDayOfMonth();
		int FNac = (fechaUlt.getYear()*365)+(fechaUlt.getMonthValue()*30)+ fechaUlt.getDayOfMonth();
		return (FAct - FNac)/ 365;
	};
	
	
	/* ------------------------------------------------------------------*/


	/* --- SETERS -------------------------------------------------------*/
	
	public void setRopa(String a) {tipo_ropa = a;};
	public void setPrecio(int a) {precio = a;};
	public void setCantidad(int a) {cantidad += a;};
	public void setCantidadTotal(int a) {cantidad = a;};
	
	/* ------------------------------------------------------------------*/

	
	
}
