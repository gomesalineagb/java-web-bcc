package br.com.bo;

import java.util.List;

import br.com.bean.CarroBean;
import br.com.dao.CarroDAO;

public class CarroBO {
	
	public String cadastraCarro(String modeloCarro, String fabricanteCarro,int yearCarro, String cor, float valor,int taAlugado) {
		
		CarroBean carroBean = new CarroBean(modeloCarro,fabricanteCarro,yearCarro,cor,valor,taAlugado);
		CarroDAO carroDAO = new CarroDAO();
		
		if(carroDAO.cadastraCarro(carroBean)) {
			return "ListCar.jsp";
		}else {
			return "FormCadastroCar.jsp";
		}
	}
	
	public List<CarroBean> listarCarros(){
		
		return new CarroDAO().listarCarros();
	}
}
