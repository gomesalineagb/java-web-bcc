package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.ClienteBean;

public class ClienteDAO {
	private static List<ClienteBean> lista = null;
	
	public ClienteDAO() {
		if (lista == null) {
			lista = new ArrayList<ClienteBean>();
		}
	}
	
	public boolean cadastraCliente(ClienteBean clienteBean) {
		if (lista != null) {
			for (ClienteBean cliente : lista) {
				if (cliente.getNameCliente().compareTo(clienteBean.getNameCliente()) == 0) {
					return false;
				}
			}
		}
		if (clienteBean.getNameCliente().compareTo("") == 0 || 
				clienteBean.getTelephoneCliente().compareTo("") == 0 || 
				clienteBean.getAdressCliente().compareTo("") == 0 ){
			return false;
		}
		lista.add(clienteBean);
		return true;
	}
	
	public List<ClienteBean> listCliente(){
		return ClienteDAO.lista;
	}
}
