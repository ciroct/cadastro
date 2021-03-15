package br.unisantos.cadastro.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

    private String login;
    private String password;
    private Boolean especial;
    private List<String> cores;
    private String escolaridade;
    private Integer anoFormacao;
    private List<String> idiomas;

    public User() { }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEspecial() {
		return especial;
	}

	public void setEspecial(Boolean especial) {
		this.especial = especial;
	}

	public List<String> getCores() {
		return cores;
	}

	public void setCores(List<String> cores) {
		this.cores = cores;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Integer getAnoFormacao() {
		return anoFormacao;
	}

	public void setAnoFormacao(Integer anoFormacao) {
		this.anoFormacao = anoFormacao;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}

}
