package br.unisantos.cadastro.control;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.unisantos.cadastro.model.User;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String LOGIN = "ciro";
	private static final String PASSWORD = "123";

	private User user = new User();

	public UserBean() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String validar() {
		if (user.getLogin().equals(LOGIN) && user.getPassword().equals(PASSWORD)) {
			return "/cadastro";
		}
		FacesContext.getCurrentInstance().addMessage("form:submit", new FacesMessage("Erro: login/senha inválidos!"));
		return null;
	}

}
