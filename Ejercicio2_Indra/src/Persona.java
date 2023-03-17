
public class Persona implements Humano{
	private String nombre, apellido,localidad,posicion;
	private int sueldo;
	
	//Getters
	public String getNombre() {return nombre;};
	public String getApellido() { return apellido;};
	public String getNombreCompleto() {return nombre + " " + apellido;};
	public String getLocalidad() {return localidad;};
	public String getPosicion() {return posicion;};
	public int getSueldo() { return sueldo;};
	
	//Setters
	public void setNombre(String a) {nombre = a;};
	public void setApellido(String a) {apellido = a;};
	public void setLocalidad(String a) {localidad = a;};
	public void setPosicion(String a) {posicion = a;};
	public void setSueldo(int a) {sueldo = a;};
	
}
