/**
 * 
 */
package com.aburgos.projectjsf.controllers;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Alexis
 *	
 *Clase que se encarga de cerrar la sesión del usuario.
 *
 */

@ManagedBean
public class SessionClosedController {
	
	public void cerrarSesion() {
		
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		ex.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	

}
