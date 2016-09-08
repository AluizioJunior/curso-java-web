package br.com.junior.jdbc.teste;



import br.com.junior.jdbc.dao.ContatoDao;
import br.com.junior.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) throws Exception {
		
		Contato contato = new Contato();
		contato.setId(Long.valueOf(1));
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);

	}

}
