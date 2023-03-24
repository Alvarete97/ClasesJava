import java.time.LocalDate;

public class Empleado extends Persona implements Empleados{
	
	public Empleado() {super();}
	
	private int N_Compras, Antiguedad;
	private LocalDate FechInc,FechR, FechAct = LocalDate.now();
	private String Membresia;
	private boolean activo = true;

	/*------------------GETTERS---------------------*/
	
	public int getCompras() {return N_Compras;};
	public LocalDate getFechR() { return FechR;}; 
	public boolean checkActividad() {return activo;}
	
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

	public String getMembresia() {return Membresia;}

	
	/*------------------SETTERS---------------------*/
	
	
	public void setCompras(int a) {N_Compras = a;};
	public void setIn(LocalDate a) {FechInc = a;};
	public void setLast(LocalDate a) {FechR = a;};
	
	
	
	/*------------------ RECURSIVOS ---------------------*/
	
	void setMemb() {
		if(this.getCompras() < 6 && this.getCompras() < 0) 
		{
			this.Membresia = "Estandar User";
		}else if (this.getCompras() > 5 && this.getCompras() < 11) 
		{
			this.Membresia = "Affiliate";
		} else if (this.getCompras() > 10) 
		{
			this.Membresia = "Premier";
		}else 
		{
			this.Membresia = "None";
		}
	};
	
	void Actividad() {
		if(this.getUltVisita() > 2) {
			activo = false;
		}
	}
	
}
