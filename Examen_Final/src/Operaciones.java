
public class Operaciones implements I_Operaciones{

	public String diasRest(Vuelos v) 
	{
		String s = "";
		s += " " + v.getNombre() + " días restantes para el vuelo:\n";
		s += "\t" + v.tiempoRestante()+ "\n";
		return s;
	}
	
	public String valorFinalVuelo(Vuelos v) {
		
		return " " + v.getNombre()+ "-"+ v.getTipo() + " valor final por vuelo:\n" + 
				"\t" + valorFV(v) + "\n";
	}
	
	public int valorFV(Vuelos v) 
	{
		return v.getValUnit() * v.getNPasajero();
	}
	
	
	public String segmentacion(Vuelos v) 
	{
		String s = "";
		if((v.getTipo().equals("ECONOMICO")) && ((v.getValUnit() * v.getNPasajero()) >= 100)) 
		{
			s = " " + v.getNombre() + " es RANTABLE \n";
			
		}else if((v.getTipo().equals("ECONOMICO")) && ((v.getValUnit() * v.getNPasajero()) < 100))
		{
			s = " " + v.getNombre() + " NO es RANTABLE \n";
			
		}else if((v.getTipo().equals("PREMIER")) && ((v.getValUnit() * v.getNPasajero()) >= 1500)) 
		{
			s = " " + v.getNombre() + " es RANTABLE \n";
			
		}else
		{
			s = " " + v.getNombre() + " NO es RANTABLE \n";
		}
		return s;
	}
}
