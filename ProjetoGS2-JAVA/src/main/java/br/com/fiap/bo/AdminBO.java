package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Admin;
import br.com.fiap.dao.AdminDAO;

public class AdminBO {
	
	AdminDAO adminDAO;
	
	// Selecionar 
		public ArrayList<Admin> selecionarBo() throws ClassNotFoundException, SQLException{
			adminDAO = new AdminDAO();
			
		return (ArrayList<Admin>) adminDAO.selecionar();
			
	}
		// Inserir 
		public void inserirBo(Admin admin) throws ClassNotFoundException, SQLException {
			AdminDAO adminDAO = new AdminDAO();
			
			adminDAO.inserir(admin);
		}
		
		

}
