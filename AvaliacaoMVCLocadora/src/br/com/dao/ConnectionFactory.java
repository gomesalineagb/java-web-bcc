package br.com.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/dblocadora";
		String user = "root";
		String password = "password";
		
		try {
			//inicializar o driver q foi importado
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException("Erro na conexao: "+e);
		}
	}
}
