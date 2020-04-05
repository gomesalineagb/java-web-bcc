package br.com.web.model;

public class VeiculoModel {
	String nome;
	double valor;
	boolean isAlugado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean getIsAlugado() {
		return isAlugado;
	}
	public void setIsAlugado(boolean isAlugado) {
		this.isAlugado = isAlugado;
	}
	
	public VeiculoModel(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.isAlugado = false;
	}
	
	
}
