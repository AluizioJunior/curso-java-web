package br.com.junior.jdbc.teste;

import java.sql.Connection;

import br.com.junior.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws Exception{
		//Testa a conexão
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("<<Conexão aberta!>>");
		connection.close();

	}

}
