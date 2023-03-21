import java.time.LocalDate;

public class Persona{
	
	private String nombre, apellido,localidad,posicion;
	private int DNI,sueldo, Edad, Antiguedad;
	private LocalDate fechNac,fechInc, fechAct = LocalDate.now();
	
  
	
	//Getters
	public String getNombre() {return nombre;};
	public String getApellido() { return apellido;};
	public String getLocalidad() {return localidad;};
	public String getPosicion() {return posicion;};
	public int getDNI() { return DNI;};
	public int getSueldo() { return sueldo;};
	public LocalDate getNac() { return fechNac;};
	
	public int getEdad() 
	{
		int FAct = (fechAct.getYear()*365)+(fechAct.getMonthValue()*30)+ fechAct.getDayOfMonth();
		int FNac = (fechNac.getYear()*365)+(fechNac.getMonthValue()*30)+ fechNac.getDayOfMonth();
		Edad = (FAct - FNac)/ 365;
		return Edad;
	};
	
	public int getOld() 
	{
		int FAct = (fechAct.getYear()*365)+(fechAct.getMonthValue()*30)+ fechAct.getDayOfMonth();
		int FInc = (fechInc.getYear()*365)+(fechInc.getMonthValue()*30)+ fechInc.getDayOfMonth();
		Antiguedad = (FAct - FInc)/ 365;
		return Antiguedad;
	};
	
	
	//Setters
	public void setNombre(String a) {nombre = a;};
	public void setApellido(String a) {apellido = a;};
	public void setLocalidad(String a) {localidad = a;};
	public void setPosicion(String a) {posicion = a;};
	public void setSueldo(int a) {sueldo = a;};
	public void setDNI(int a) {DNI = a;};
	public void setNac(LocalDate a) {fechNac = a;};
	public void setIn(LocalDate a) {fechInc = a;};
	
}
