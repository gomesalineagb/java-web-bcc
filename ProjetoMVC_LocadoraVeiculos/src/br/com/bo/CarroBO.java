package br.com.bo;

import java.util.List;

import br.com.bean.CarroBean;
import br.com.dao.CarroDAO;

public class CarroBO {
	
	public String cadastraCarro(String modeloCarro, String fabricanteCarro,String yearCarro) {
		
		CarroBean carroBean = new CarroBean(modeloCarro,fabricanteCarro,yearCarro);
		CarroDAO carroDAO = new CarroDAO();
		
		if(carroDAO.cadastraCarro(carroBean)) {
			return "ListCar.jsp";
		}else {
			return "FormCadastroCar.jsp";
		}
	}
	
	public List<CarroBean> listCar(){
		return new CarroDAO().listCar();
	}
}
