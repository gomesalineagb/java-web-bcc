package br.com.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.CarroBean;
import br.com.dao.CarroDAO;

public class CarroBO {
	
	public String cadastraCarro(String modeloCarro, String fabricanteCarro,int yearCarro, String cor, float valor,int taAlugado) {
		
		CarroBean carroBean = new CarroBean(modeloCarro,fabricanteCarro,yearCarro,cor,valor,taAlugado);
		
		if(new CarroDAO().cadastraCarro(carroBean)) {
			return "TratarCarro/ListarCarros.jsp";
		}
		return "TratarCarro/FormCadastrarCarro.jsp";
	}
	 
	public List<CarroBean> listarCarros(){ 
		return new CarroDAO().listarCarros();
	}
	
	public List<CarroBean> listarCarrosDisponiveis(){ 
		List<CarroBean> carros = new CarroDAO().listarCarros();
		List<CarroBean> carrosDisponiveis = new ArrayList<CarroBean>();
		for (CarroBean carro : carros) {
			if (carro.getTaAlugado() == 0) {
				carrosDisponiveis.add(carro);
			}
		}
		return carrosDisponiveis;
	}
	
	public boolean alugarCarro(int id) {
		
		CarroDAO carroDao = new CarroDAO();
		CarroBean carro = carroDao.buscarPorId(id);
		
		if (carro != null) {
			if(carro.getTaAlugado() == 1) {
				return false;
			}
			carroDao.alugarCarro(id);
			return true;
		}
		
		return false;
	}
	
	public boolean atualizarCarro(String cor, float valor,int id) {
		
		return new CarroDAO().atualizarCarro(cor, valor, id);
	}
	
	public boolean excluirCarro(int id) {
		CarroDAO carroDao = new CarroDAO();
		CarroBean carro = carroDao.buscarPorId(id);
		
		if (carro != null) {
			if(carro.getTaAlugado() == 1) {
				return false;
			}
			carroDao.excluirCarro(id);
			return true;
		}
		
		return false;
	}
	
	public CarroBean buscarPorId(int id) {
		return new CarroDAO().buscarPorId(id);
	}
	
	public ArrayList<CarroBean> buscarPorModelo(String modelo){
		
		return new CarroDAO().buscarPorModelo(modelo);		
	}
	
}
