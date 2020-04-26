package br.com.bean;

public class CarroBean {
	private String fabricanteCarro;
	private String modeloCarro;
	private String yearCarro;
	private int id;
	
	public CarroBean(String fabricanteCarro, String modeloCarro,String yearCarro) {
		super();
		this.fabricanteCarro = fabricanteCarro;
		this.modeloCarro = modeloCarro;
		this.yearCarro = yearCarro;
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

	public String getYearCarro() {
		return yearCarro;
	}

	public void setYearCarro(String yearCarro) {
		this.yearCarro = yearCarro;
	}

	public int getIdCarro() {
		return 1;
	}
}
