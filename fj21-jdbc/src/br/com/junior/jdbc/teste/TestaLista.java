package br.com.junior.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;
import br.com.junior.jdbc.dao.ContatoDao;
import br.com.junior.jdbc.modelo.Contato;


public class TestaLista {

	public static void main(String[] args) throws ClassNotFoundException {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato:contatos){
			System.out.println("Nome:"+ contato.getNome());
			System.out.println("Email:" + contato.getEmail());
			System.out.println("Endere�o:" + contato.getEndereco());
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");			
			System.out.println("Data de Nascimento:" + sdf.format(contato.getDataNascimento().getTime()) + "\n");
			
		}

	}

}