import java.time.LocalDate;

public interface Empleados {

	public int getCompras();
	public LocalDate getFechR();
	public int getOld();
	public int getUltVisita();
	
	public void setCompras(int a);
	public void setIn(LocalDate a);
	public void setLast(LocalDate a);
}
