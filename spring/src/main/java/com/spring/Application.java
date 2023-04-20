package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring.EmpleadoJefe;
import com.spring.spring.Empleados;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Cargar Archivo Sprinx XML. En el parentesis debe ir el nombre exacto de
		// nuestro archivo de configuraciión XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpleadoJefe empleado1 = new EmpleadoJefe();
		Empleados empleado2= new EmpleadoJefe();

//6.4 Creamos un objeto de tipo Empleado, y lo igualamos al contexto creado
    //el comando .getBean requiere 2 parametros (nombreBean, Typo objeto)
    Empleados Jaime = contexto.getBean("miEmpleado", Empleados.class);
    System.out.println("EL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo " +Jaime.getClass());
    System.out.println(Jaime.getResponsabilidades());

	/*7.4 Inyeccion de dependencias */
System.out.println(Jaime.getDocumento());

	contexto.close();
	}
	/* ¿porque este código me devuelve el siguiente error: 19:53:21.079 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext -- Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@7e0e6aa2
Exception in thread "main" org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException: Line 11 in XML document from class path resource [applicationContext.xml] is invalid?
*/

}
