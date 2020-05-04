package br.com.bean;

public class CarroBean {
	private String fabricanteCarro;
	private String modeloCarro;
	private int yearCarro;
	private String cor;
	private float valor;
	private int taAlugado;
	private int idCarro;
	
	public CarroBean(String modeloCarro, String fabricanteCarro,int yearCarro, String cor, float valor,int taAlugado) {
		super();
		this.fabricanteCarro = fabricanteCarro;
		this.modeloCarro = modeloCarro;
		this.yearCarro = yearCarro;
		this.cor = cor;
		this.valor = valor;
		this.taAlugado = taAlugado;
	}

	public String getFabricanteCarro() {
		return fabricanteCarro;
	}

	public void setFabricanteCarro(String fabricanteCarro) {
		this.fabricanteCarro = fabricanteCarro;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public int getYearCarro() {
		return yearCarro;
	}

	public void setYearCarro(int yearCarro) {
		this.yearCarro = yearCarro;
	}
	
	public int getIdCarro() {
		return this.idCarro;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getTaAlugado() {
		return this.taAlugado;
	}

	public void setTaAlugado(int taAlugado) {
		this.taAlugado = taAlugado;
	}
}
