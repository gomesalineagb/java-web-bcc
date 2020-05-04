package br.com.bo;

import java.util.List;

import br.com.bean.CarroBean;
import br.com.bean.ClienteBean;
import br.com.dao.CarroDAO;
import br.com.dao.ClienteDAO;

public class ClienteBO {
	
	public String cadastraCliente(String nomeCliente, String telephoneCliente, String adressCliente) {
		
		ClienteBean clienteBean = new ClienteBean(nomeCliente,telephoneCliente,adressCliente);
		ClienteDAO clienteDAO = new ClienteDAO();
		
		if (clienteDAO.cadastraCliente(clienteBean)) {
			return "ListClient.jsp";
		}else {
			return "FormCadastroCliente.jsp";
		}
	}
	public List<ClienteBean> listCliente(){
		return new ClienteDAO().listCliente();
	}
}
