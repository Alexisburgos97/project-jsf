package com.aburgos.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.aburgos.projectjsf.dto.UsuarioDTO;

/**
 * 
 * @author Alexis
 * 
 * Clase que permite controlar el funcionamiento con la pantalla login.xhtml
 *
 */

@ManagedBean
public class LoginController {
	
	private String usuario;
	
	private String password;
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	
	
	public void ingresar() {
		System.out.println("Ingresando al sistema, Usuario: " + usuario);	
		
		if(usuario.equals("alexis") && password.equals("1234")) {
			/*FacesContext.getCurrentInstance().addMessage(
					"formLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario Correcto",""));*/
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				sessionController.setUsuarioDTO(usuarioDTO);
				
				this.redireccionar("principal.xhtml");
				
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage(
						"formLogin:txtUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL,"La página no existe",""));
				e.printStackTrace();
			}
			
		}else {
			FacesContext.getCurrentInstance().addMessage(
					"formLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contraseña incorrecto",""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
	
	

}
