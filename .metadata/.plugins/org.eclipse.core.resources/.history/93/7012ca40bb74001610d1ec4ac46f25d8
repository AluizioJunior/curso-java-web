package br.com.junior.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.junior.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//Testa a conexão
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("<<Conexão aberta!>>");
		connection.close();

	}

}
