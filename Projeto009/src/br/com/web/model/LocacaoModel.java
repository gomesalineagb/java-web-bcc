package br.com.web.model;

public class LocacaoModel {
	private ClienteModel cliente;
	private VeiculoModel veiculo;
	private int dtDevolucao;
	
	
	public LocacaoModel(ClienteModel cliente, VeiculoModel veiculo, int dtDevolucao) {
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dtDevolucao = dtDevolucao;
	}
	
	public ClienteModel getCliente() {
		return cliente;
	}
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	public VeiculoModel getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(VeiculoModel veiculo) {
		this.veiculo = veiculo;
	}
	public int getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(int dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	
}
