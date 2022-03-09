package br.unisantos.cadastro.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

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

	public String[] getAnosFormacao() {
		String[] anos = new String[50];
		int anoAtual = new GregorianCalendar().get(GregorianCalendar.YEAR);
		for (int i = 0; i < 50; i++) {
			anos[i] = String.valueOf(anoAtual - i);
		}
		return anos;
	}

	public List<SelectItem> getListaDeIdiomas() {
		List<SelectItem> idiomas = new ArrayList<>();
		idiomas.add(new SelectItem("Inglês", "English"));
		idiomas.add(new SelectItem("Francês", "Français"));
		idiomas.add(new SelectItem("Italiano", "Italiano"));
		idiomas.add(new SelectItem("Espanhol", "Español"));
		return idiomas;
	}
}
