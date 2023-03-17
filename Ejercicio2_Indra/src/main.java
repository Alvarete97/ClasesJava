import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	
	
	public static String harcodeEmp (Empleado e1,Empleado e2,Empleado e3) {
		
		e1.setNombre("Alvaro");
		e1.setApellido("Sal");
		e1.setLocalidad("Mostoles");
		e1.setPosicion("Junior");
		e1.setSueldo(1000);
		
		e2.setNombre("Maria");
		e2.setApellido("Lopez");
		e2.setLocalidad("Madrid");
		e2.setPosicion("Senior");
		e2.setSueldo(5000);
		
		e3.setNombre("Asier");
		e3.setApellido("Menendez");
		e3.setLocalidad("Bruselas");
		e3.setPosicion("Director");
		e3.setSueldo(10000);
		
		return e1 + " " + e2 + " " + e3;
	}
	
	
	
	public static void  main(String []args) 
	{
		Empleado b = new Empleado();
		Empleado a = new Empleado();
		Empleado c = new Empleado();
		
		String empleados = harcodeEmp(a, b, c);
		Fichero f = new Fichero();
		
		f.Escri(empleados);
		f.Leer();
		
	}
	
}
