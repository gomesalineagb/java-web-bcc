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
		String sql = "INSERT INTO carro (modelo,fabricante,ano,cor,valor,taAlugado) values(?,?,?,?,?,?)";
		
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
				CarroBean carroBean = new CarroBean(rs.getString("modelo"),rs.getString("fabricante"),
						rs.getInt("ano"),rs.getString("cor"),rs.getFloat("valor"),rs.getInt("taAlugado"));
				carroBean.setIdCarro(rs.getInt("idcarro"));
				lista.add(carroBean);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return lista;
	}
	
	public boolean alugarCarro(int id) {
		String sql = "UPDATE carro SET taAlugado = '"+1+"' WHERE idcarro = '"+id+"'";
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean excluirCarro(int id) {
		
		String sql = "DELETE FROM carro WHERE idcarro = '"+id+"'";
		
		try {
			st = conn.createStatement();
			st.execute(sql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	public boolean atualizarCarro(String cor, float valor,int id) {
		String sql = "UPDATE carro SET cor = ?,valor = ? WHERE idcarro = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cor);
			ps.setFloat(2, valor);
			ps.setInt(3, id);
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			return false;		
		}
	
	}
	
	public CarroBean buscarPorId(int id) {
		String sql = "SELECT * FROM carro WHERE idcarro = '"+id+"'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);//retorna uma lista de valores, varre a lista e bota na this.lista
			rs.next();
			CarroBean carroBean = new CarroBean(rs.getString("modelo"),rs.getString("fabricante"),
						rs.getInt("ano"),rs.getString("cor"),rs.getFloat("valor"),rs.getInt("taAlugado"));
				carroBean.setIdCarro(rs.getInt("idcarro"));
			rs.close();
			st.close();
			return carroBean;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public ArrayList<CarroBean> buscarPorModelo(String modelo){
		String sql = "SELECT * FROM carro WHERE modelo LIKE '%"+modelo+"%'";
		ArrayList<CarroBean> carros = new ArrayList<CarroBean>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);//retorna uma lista de valores, varre a lista e bota na this.lista
			while(rs.next()) {
				System.out.println("encontrooou");
				CarroBean carroBean = new CarroBean(rs.getString("modelo"),rs.getString("fabricante"),
						rs.getInt("ano"),rs.getString("cor"),rs.getFloat("valor"),rs.getInt("taAlugado"));
				carroBean.setIdCarro(rs.getInt("idcarro"));
				carros.add(carroBean);
			}
			rs.close();
			st.close();
			System.out.println("executou");
			return carros;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
