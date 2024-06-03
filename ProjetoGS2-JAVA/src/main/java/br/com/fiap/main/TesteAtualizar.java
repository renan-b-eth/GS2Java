package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Admin;
import br.com.fiap.dao.AdminDAO;

public class TesteAtualizar {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Admin objAdmin = new Admin();
	
		

		AdminDAO dao = new AdminDAO();
		
		objAdmin.setId(inteiro("Insira o ID"));
		objAdmin.setNome(texto("Nome"));
		objAdmin.setSobrenome(texto("Sobrenome"));
		
		System.out.println(dao.atualizar(objAdmin));

	}

}
