package br.com.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.bean.CarroBean;
import java.sql.Statement;
import java.sql.ResultSet;

public class CarroDAO {
	private Connection conn;
	private PreparedStatement ps;//representa execucao sql
	private Statement st;
	private ResultSet rs;
	private ArrayList<CarroBean> lista;
	
	public CarroDAO() {
		conn = new ConnectionFactory().getConnection();
		lista = new ArrayList<CarroBean>();
	}
	
	public boolean cadastraCarro(CarroBean carroBean) {
		String sql = "INSERT INTO carro(modelo,fabricante,ano,cor,valor,taAlugado) values(?,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, carroBean.getModeloCarro());
			ps.setString(2, carroBean.getFabricanteCarro());
			ps.setInt(3, carroBean.getYearCarro());
			ps.setString(4, carroBean.getCorCarro());
			ps.setFloat(5, carroBean.getValorCarro());
			ps.setInt(6, carroBean.getTaAlugado());
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			return false;		
		}
	}

	public ArrayList<CarroBean> listarCarros(){
		String sql = "SELECT * FROM carro";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);//retorna uma lista de valores, varre a lista e bota na this.lista
			while (rs.next()) {
				CarroBean carroBean = new CarroBean(rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getFloat(6),rs.getInt(7));
				carroBean.setIdCarro(rs.getInt(1));
				lista.add(carroBean);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return lista;
	}
	
	public void alugarCarro(int id) {
		String sql = "UPDATE carro SET taAlugado = '"+1+"' where idcarro = '"+id+"'";
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
