import java.time.LocalDate;

public class Persona implements Humano{
	
	private String Nombre,Pais;
	private int Edad;
	private LocalDate FechNac, FechAct = LocalDate.now();
	
  
	
	//Getters
	public String getNombre() {return Nombre;};
	public String getPais() { return Pais;};
	public LocalDate getNac() { return FechNac;};
	
	
	public int getEdad() 
	{
		int FAct = (FechAct.getYear()*365)+(FechAct.getMonthValue()*30)+ FechAct.getDayOfMonth();
		int FNac = (FechNac.getYear()*365)+(FechNac.getMonthValue()*30)+ FechNac.getDayOfMonth();
		Edad = (FAct - FNac)/ 365;
		return Edad;
	};
	
	
	//Setters
	public void setNombre(String a) {Nombre = a;};
	public void setPais(String a) {Pais = a;};
	public void setNac(LocalDate a) {FechNac = a;};
	
}
