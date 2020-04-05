package br.com.web.model;

public class ClienteModel {
	String usuario;
	String senha;
	
	public ClienteModel(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
 
}
