package br.com.junior.jdbc.teste;

import java.sql.Connection;

import br.com.junior.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws Exception{
		//Testa a conex�o
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("<<Conex�o aberta!>>");
		connection.close();

	}

}
