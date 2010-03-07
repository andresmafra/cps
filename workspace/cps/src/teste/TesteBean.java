/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author André
 */
public class TesteBean {

    public TesteBean() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("usuarioLogado", "teste");
    }

    public String login() {
        return "logado";
    }
}
