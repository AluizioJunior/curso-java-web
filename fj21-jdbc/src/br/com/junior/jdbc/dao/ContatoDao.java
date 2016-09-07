package br.com.junior.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.junior.jdbc.ConnectionFactory;
import br.com.junior.jdbc.modelo.Contato;

//Gerencia a conexão e insere Contatos no banco de dados,
public class ContatoDao {

	private Connection connection;
	
	public ContatoDao() throws ClassNotFoundException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	//Adiciona um contato
	public void adiciona(Contato contato){
		String sql = "insert into contatos"+"(nome,email,endereco,dataNascimento)"+"values(?,?,?,?)";
		
		try {
			
			//prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			//seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			//executa
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
