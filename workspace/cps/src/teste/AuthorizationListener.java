/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.Serializable;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 *
 * @author André
 */
public class AuthorizationListener implements PhaseListener,Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4531L;
	
	public static final String[] urls = {"/login.jsp", "/depoisdoindex.jsp"};

    public boolean verificarAutorizacao(String paginaRequisitada) {
        for (String s : urls) {
            if (paginaRequisitada.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void afterPhase(PhaseEvent event) {
        FacesContext facesContext = event.getFacesContext();
        String currentPage = facesContext.getViewRoot().getViewId();

        boolean isLoginPage = (currentPage.lastIndexOf("login.jsp") > -1);
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        Object currentUser = session.getAttribute("usuarioLogado");

        if (!isLoginPage && currentUser == null) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null,"loginPage");
        }
    }

    public void beforePhase(PhaseEvent event) {
    	FacesContext facesContext = event.getFacesContext();
    	if(getPhaseId() == null){
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null,"loginPage");
    	}
    		
    }

    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}
