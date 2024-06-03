package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.AdminDAO;
import br.com.fiap.dao.UsuarioDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Usuario objUsuario = new Usuario();
		Admin objAdmin = new Admin();
		
		UsuarioDAO dao = new UsuarioDAO();
		AdminDAO dao2 = new AdminDAO();
		
		/*objUsuario.setId(inteiro("Digite o ID"));*/
		objAdmin.setId(inteiro("Digite o ID"));
		
		
		/*System.out.println(dao.deletar(objUsuario.getId()));*/
		System.out.println(dao2.deletar(objAdmin.getId()));

	}

}
