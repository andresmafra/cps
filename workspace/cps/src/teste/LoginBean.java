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

public class LoginBean {

	private String usuario;
	private String senha;
	
    public LoginBean() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("usuarioLogado", "teste");
    }

    public String login() {
    	if(this.getUsuario().equals("teste") && this.getSenha().equals("teste"))
        return "logado";
    	return "";
    }

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}
}
