package br.com.bo;

import br.com.bean.UsuarioBean;
import br.com.dao.UsuarioDAO;

public class UsuarioBO {
	
	public boolean login(String user,String password) {
		UsuarioBean usuarioBean = new UsuarioBean(user, password);
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		return usuarioDao.login(usuarioBean);
	}

}
