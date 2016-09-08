package br.com.junior.jdbc.teste;


import java.util.Calendar;

import br.com.junior.jdbc.dao.ContatoDao;
import br.com.junior.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) throws Exception{
		
		Contato contato = new Contato();
		contato.setId(Long.valueOf(1));
		contato.setNome("");
		contato.setEmail("");
		contato.setEndereco("");
		
		Calendar data = Calendar.getInstance();
		contato.setDataNascimento(data);
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);	
	}
}
