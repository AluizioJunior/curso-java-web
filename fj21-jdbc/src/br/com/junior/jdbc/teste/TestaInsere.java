package br.com.junior.jdbc.teste;

import java.util.Calendar;

import br.com.junior.jdbc.dao.ContatoDao;
import br.com.junior.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// preenchendo o modelo
		Contato contato = new Contato();
		contato.setNome("Primeiro Nome");
		contato.setEmail("primeiro@email.com.br");
		contato.setEndereco("primeiro Endereço registrado");
		contato.setDataNascimento(Calendar.getInstance());
		
		//passa o modelo para o dao enviar ao banco
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		System.out.println("<<Gravado!>>");

	}

}
