package es.login.aop00;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class Aspecto 
{
	// Se le ha de indicar a que ejecucion ha de anticiparse
	@Before("execution(public void cierraPrograma())")
	public void prep()
	{
	
		System.out.println("Se está generando un fichero ... \n \n");
	};
	
	
	// Se le ha de indicar a que ejecucion ha de concatenarse
	@After("execution(public void cierraPrograma())")
	public void end()
	{
		System.out.println("El programa se ha cerrado con éxito. :D");
	};
}
