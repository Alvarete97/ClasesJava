package es.login.aop00;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("es.login.aop00") //Esto le indica que va a scannear este paquete buscando Aspectos.
@ComponentScan("es.login.aop.dao") //Esto le indica que va a scannear este paquete buscando Aspectos.

@EnableAspectJAutoProxy

public class Configuracion 

{

}