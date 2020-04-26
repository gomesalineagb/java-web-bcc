package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.CarroBean;

public class CarroDAO {
	private static List<CarroBean> lista = null;
	
	public CarroDAO() {
		if (lista == null) {
			lista = new ArrayList<CarroBean>();	
		}
	}
	
	public boolean cadastraCarro(CarroBean carroBean) {
		if (carroBean.getFabricanteCarro().compareTo("") == 0 || 
				carroBean.getModeloCarro().compareTo("") == 0 || 
				carroBean.getYearCarro().compareTo("") == 0) {
			return false;
		}
		lista.add(carroBean);
		return true;
	}
	
	public List<CarroBean> listCar(){
		return CarroDAO.lista;
	}
	
}
