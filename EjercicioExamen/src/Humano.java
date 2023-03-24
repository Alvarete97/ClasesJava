import java.time.LocalDate;

public interface Humano {

	public String getNombre();
	public String getPais();
	public LocalDate getNac();
	public int getEdad();
	
	public void setNombre(String a);
	public void setPais(String a);
	public void setNac(LocalDate a);
}
