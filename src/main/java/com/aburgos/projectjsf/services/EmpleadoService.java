/**
 * 
 */
package com.aburgos.projectjsf.services;

import java.util.ArrayList;

import java.util.List;

import com.aburgos.projectjsf.entity.Empleado;

/**
 * @author Alexis
 * 
 * Clase que permite realizar la lógica de negocio para empleados.
 *
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
	
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrososft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado();
		Empleado empleado6 = new Empleado();
		
		empleadoIBM.setNombre("Alexis");
		empleadoIBM.setApellido("Burgos");
		empleadoIBM.setPuesto("Developer java Jr");
		empleadoIBM.setEstado(true);
		
		empleadoMicrososft.setNombre("Pedro");
		empleadoMicrososft.setApellido("Lopez");
		empleadoMicrososft.setPuesto("Developer java Senior");
		empleadoMicrososft.setEstado(true);
		
		empleadoApple.setNombre("Juan");
		empleadoApple.setApellido("Perez");
		empleadoApple.setPuesto("Developer java Semi Senior");
		empleadoApple.setEstado(true);
		
		empleado1.setNombre("Jose");
		empleado1.setApellido("Lopez");
		empleado1.setPuesto("Developer PHP Semi Senior");
		empleado1.setEstado(true);
		
		empleado2.setNombre("Rodrigo");
		empleado2.setApellido("Cortez");
		empleado2.setPuesto("Developer PHP Senior");
		empleado2.setEstado(true);
		
		empleado3.setNombre("Kyliam");
		empleado3.setApellido("gonzalez");
		empleado3.setPuesto("Developer PHP junior");
		empleado3.setEstado(true);
		
		empleado4.setNombre("Raul");
		empleado4.setApellido("Krats");
		empleado4.setPuesto("Developer Javascript Senior");
		empleado4.setEstado(true);
		
		empleado5.setNombre("Pedro");
		empleado5.setApellido("Gonzalez");
		empleado5.setPuesto("UX/UI");
		empleado5.setEstado(true);
		
		empleado6.setNombre("Tiago");
		empleado6.setApellido("Jino");
		empleado6.setPuesto("Software engineer");
		empleado6.setEstado(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrososft);
		empleados.add(empleadoApple);
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		empleados.add(empleado4);
		empleados.add(empleado5);
		empleados.add(empleado6);
		
		return empleados;
	}
	
}
