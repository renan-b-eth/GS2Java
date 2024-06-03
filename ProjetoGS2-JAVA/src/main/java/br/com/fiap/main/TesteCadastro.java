package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Admin;
import br.com.fiap.dao.AdminDAO;
import br.com.fiap.dao.UsuarioDAO;

public class TesteCadastro {
	
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
		Admin adm = new Admin();
		
		AdminDAO dao = new AdminDAO();
		
		adm.setId(inteiro("id:"));
		adm.setNome(texto("Nome"));
		adm.setSobrenome(texto("Sobrenome:"));
		adm.setSexo(texto("Sexo"));
		adm.setCargo(texto("Cargo:"));
		adm.setId_endereco(inteiro("Id endereço"));
		adm.setId_telefone(inteiro("Id Telefone"));
		
		System.out.println(dao.inserir(adm));
		
		
	}

}
