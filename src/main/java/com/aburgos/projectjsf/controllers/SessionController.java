/**
 * 
 */
package com.aburgos.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.aburgos.projectjsf.dto.UsuarioDTO;

/**
 * @author Alexis
 * 
 * Clase que se encarga de mantener la información del usuario que ingresa al aplicativo en sesión. 
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que se mantendra en sesión
	 */
	
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en sesión...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	

}
