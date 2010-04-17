package br.iteratorsystems.cps.common;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

	public static void errorMessage(String componentId, String message, String detail){
		final FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(componentId, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, detail));
	}
}
