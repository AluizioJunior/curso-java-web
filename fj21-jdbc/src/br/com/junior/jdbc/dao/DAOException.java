package br.com.junior.jdbc.dao;

//No eclipse tem uma opcäo para desativar esse Warning: Windows -> Preferences -> Java -> Compiler -> Error/Warnings 
//(possivel tambem somente para o projeto). 
//ou usar o "@SuppressWarnings("serial"" 


@SuppressWarnings("serial")
public class DAOException extends RuntimeException {
	public DAOException(Exception e) {
		System.out.println(e);
	}
}
