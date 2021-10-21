/**
 * 
 */
package com.aburgos.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.aburgos.projectjsf.entity.Empleado;
import com.aburgos.projectjsf.services.EmpleadoService;

/**
 * @author Alexis
 *
 *	Clase controller que se encarga de procesar la información de la pantalla principal.xhtml
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados ;
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados(){
		this.empleados = this.empleadoService.consultarEmpleados();
	}
	

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
