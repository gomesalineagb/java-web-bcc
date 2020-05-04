package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.bean.CarroBean;
import br.com.bean.UsuarioBean;

public class UsuarioDAO{
	private Connection conn;
	private PreparedStatement ps;//representa execucao sql
	private Statement st;
	private ResultSet rs;
	
	public UsuarioDAO() {
		conn = new ConnectionFactory().getConnection();
	}
	
	public boolean login(UsuarioBean usuario){
		String sql = "SELECT user,password FROM usuario where idusuario = '1'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);//retorna uma lista de valores, varre a lista e bota na this.lista
			rs.next();
			String user = rs.getString("user");
			String pass = rs.getString("password");
			if(user.compareTo(usuario.getUser()) == 0 && 
					pass.compareTo(usuario.getPassword()) == 0){
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
