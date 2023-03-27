package es.login.aop00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import es.login.aop.DAO;

public class MAIN {
	
	
	public static void main(String[] args) 
	{
		
		/* ---- EMPLEADOS ---------------------------------------------*/
		Empleado a = new Empleado();
		Empleado b = new Empleado();
		a.setNombre("Alvaro");
		a.setApellido("Fernandez");
		a.setEdad(26);
		b.setNombre("Eva");
		b.setApellido("Gomez");
		b.setEdad(32);
		/* ------------------------------------------------------------*/
		
		
		/* ---- LISTA OBJETOS -----------------------------------------*/
		String lista = "Nombre: " + a.getNombre() + "\t Apellido: " + a.getApellido() + "\t Edad: " + a.getEdad() + "\n" 
					 + "Nombre: " + b.getNombre() + "\t Apellido: " + b.getApellido() + "\t Edad: " + b.getEdad() + "\n";
		/* ------------------------------------------------------------*/
		
		
		
		/* --- GENERAR FICHERO ----------------------------------------*/
		Fichero f = new Fichero();
		f.generaTxt(lista);
		/* ------------------------------------------------------------*/
		
		
		/* --- AOP ----------------------------------------------------*/
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		DAO elCliente = contexto.getBean("DAO", DAO.class);		
		elCliente.cierraPrograma();
		contexto.close();
		/* ------------------------------------------------------------*/
		
	}
}
