import java.time.LocalDate;

public class Empleado extends Persona implements Empleados{
	
	public Empleado() {super();}
	
	private int N_Compras, Antiguedad;
	private LocalDate FechInc,FechR, FechAct = LocalDate.now();
	

	public int getCompras() {return N_Compras;};
	public LocalDate getFechR() { return FechR;}; 
	
	
	
	public int getOld() 
	{
		int FAct = (FechAct.getYear()*365)+(FechAct.getMonthValue()*30)+ FechAct.getDayOfMonth();
		int FInc = (FechInc.getYear()*365)+(FechInc.getMonthValue()*30)+ FechInc.getDayOfMonth();
		Antiguedad = (FAct - FInc)/ 365;
		return Antiguedad;
	};
	
	public int getUltVisita() 
	{
		int FAct = (FechAct.getYear()*365)+(FechAct.getMonthValue()*30)+ FechAct.getDayOfMonth();
		int FLast = (FechR.getYear()*365)+(FechR.getMonthValue()*30)+ FechR.getDayOfMonth();
		return (FAct - FLast)/ 365;
	};
	

	public void setCompras(int a) {N_Compras = a;};
	public void setIn(LocalDate a) {FechInc = a;};
	public void setLast(LocalDate a) {FechR = a;};
	
}
