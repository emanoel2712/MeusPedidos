package br.senac.sc.meuspedidos.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

	public static void addInfoMessage(String msg) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, null, msg);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
	}
	public static void addErrorMessage(String msg) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, msg);
		FacesContext.getCurrentInstance().addMessage(null, message);
	   
	
	
	
	}
	
}
