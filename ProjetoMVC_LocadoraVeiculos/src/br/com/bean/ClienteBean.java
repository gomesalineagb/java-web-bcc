package br.com.bean;

public class ClienteBean {
	private String nameCliente;
	private String telephoneCliente;
	private String adressCliente;
	private int idCliente;
	
	
	public ClienteBean(String nameCliente, String telephoneCliente, String adressCliente) {
		super();
		this.nameCliente = nameCliente;
		this.telephoneCliente = telephoneCliente;
		this.setAdressCliente(adressCliente);
	}
	
	public String getNameCliente() {
		return nameCliente;
	}
	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}
	public String getTelephoneCliente() {
		return telephoneCliente;
	}
	public void setTelephoneCliente(String cpfCliente) {
		this.telephoneCliente = cpfCliente;
	}

	public String getAdressCliente() {
		return adressCliente;
	}

	public void setAdressCliente(String adressCliente) {
		this.adressCliente = adressCliente;
	}

	public int getIdCliente() {
		return 2;
	}
	
}
