package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.AdminDAO;
import br.com.fiap.dao.UsuarioDAO;

public class UsuarioBO {
	
	UsuarioDAO usuarioDAO;
	
	// Selecionar 
		public ArrayList<Usuario> selecionarBo() throws ClassNotFoundException, SQLException{
			usuarioDAO = new UsuarioDAO();
			
		return (ArrayList<Usuario>) usuarioDAO.selecionar();
			
	}
		// Inserir 
		public void inserirBo(Usuario usuario) throws ClassNotFoundException, SQLException {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.inserir(usuario);
		}
		
		public void atualizarBo(Usuario usuario) throws ClassNotFoundException, SQLException  {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.atualizar(usuario);
		}
		
		public void deletarBo(int id) throws ClassNotFoundException, SQLException {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.deletar(id);
		}	
		
		

}
