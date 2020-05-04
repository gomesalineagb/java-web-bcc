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
	public void setIdCarro(int id) {
		this.idCarro = id;
	}

	public String getCorCarro() {
		return cor;
	}

	public void setCorCarro(String cor) {
		this.cor = cor;
	}

	public float getValorCarro() {
		return valor;
	}

	public void setValorCarro(float valor) {
		this.valor = valor;
	}

	public int getTaAlugado() {
		return this.taAlugado;
	}
	
	public String getStringTaAlugado() {
		if(this.taAlugado == 1)
			return "Indisponivel";
		return "Disponivel";
	}

	public void setTaAlugado(int taAlugado) {
		this.taAlugado = taAlugado;
	}
}
