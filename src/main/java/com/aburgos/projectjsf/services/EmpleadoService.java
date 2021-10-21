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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrososft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
	
}
