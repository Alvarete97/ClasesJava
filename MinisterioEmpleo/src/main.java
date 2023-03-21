
import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;

public class main {

		 static Empleado a = new Empleado();
		 static Empleado b = new Empleado();
		 static Empleado c = new Empleado();
		 static Empleado d = new Empleado();
		 
		
	
	
	public static void  main(String []args) 
	{
	/* --------------------- Empleados ---------------------*/
		a.setNombre("Pedro");
		a.setApellido("Montero");
		a.setLocalidad("Barcelona");
		a.setPosicion("Junior");
		a.setSueldo(1500);
		a.setDNI(23514275);
		a.setNac(LocalDate.of(1997,4,2));
		a.setIn(LocalDate.of(2022,6,1));
		
		b.setNombre("Isa");
		b.setApellido("Sanchez");
		b.setLocalidad("Madrid");
		b.setPosicion("Senior");
		b.setSueldo(2500);
		b.setDNI(96985403);
		b.setNac(LocalDate.of(1987,8,22));
		b.setIn(LocalDate.of(2020,2,1));
		
		c.setNombre("Marco");
		c.setApellido("Perez");
		c.setLocalidad("Sevilla");
		c.setPosicion("Junior");
		c.setSueldo(1500);
		c.setDNI(23324275);
		c.setNac(LocalDate.of(1998,8,30));
		c.setIn(LocalDate.of(2022,6,1));
		
		d.setNombre("Pedro");
		d.setApellido("Montero");
		d.setLocalidad("Barcelona");
		d.setPosicion("Junior");
		d.setSueldo(1500);
		d.setDNI(23514275);
		d.setNac(LocalDate.of(1997,4,2));
		d.setIn(LocalDate.of(2022,6,1));
		
		Set<Empleado> empleados = new HashSet<>();
		empleados.add(a);
		empleados.add(b);
		empleados.add(c);
		empleados.add(d);
		
		String SEmpleados = "";
		for(Empleado empleado: empleados)
		{
			SEmpleados += " Nombre: " + empleado.getNombre() +  " Apellido: " + empleado.getApellido() + " Localidad " + empleado.getLocalidad() + " Posicion: " + empleado.getPosicion() + " DNI: " + empleado.getDNI() + " Sueldo: " + empleado.getSueldo() +  "Fecha nacimiento: " + empleado.getNac() + " Edad: " + empleado.getEdad() + "Antiguedad: " + empleado.getOld() + ". " ;
		}
		Fichero f = new Fichero();
		f.Escritura(SEmpleados);
		
	}
	
	
	
}
