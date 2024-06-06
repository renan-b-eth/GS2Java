package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Usuario;
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
		Usuario usr = new Usuario();
		
		AdminDAO dao = new AdminDAO();
		UsuarioDAO dao2 = new UsuarioDAO();
		// DEIXAR O ID ENDERECO E ID TELEFONE COMO NULO E NO BANCO DE DADO TAMBÉM PODE SER NULO.
		
		// IMPORTANTE AO COLOCAR O SEXO SEMPRE MAISCULO OU M OU F OU I SE COLOCAR m ou f ou i vai da erro por causa do CHECK
		adm.setId(inteiro("id:"));
		adm.setNome(texto("Nome"));
		adm.setSobrenome(texto("Sobrenome:"));
		adm.setSexo(texto("Sexo"));
		adm.setCargo(texto("Cargo:"));
		adm.setEmail(texto("Email:"));
		adm.setSenha(texto("Senha:"));
		adm.setSenha2(texto("Senha novamente:"));
		/*adm.setId_endereco(inteiro("Id endereço"));
		adm.setId_telefone(inteiro("Id Telefone"));*/
		
		/*usr.setId(inteiro("id:"));
		usr.setNome(texto("Nome"));
		usr.setSobrenome(texto("Sobrenome:"));
		usr.setSexo(texto("Sexo"));
		usr.setId_endereco(inteiro("Id endereço"));
		usr.setId_telefone(inteiro("Id Telefone"));
		
		System.out.println(dao2.inserir(usr));*/
		
		System.out.println(dao.inserir(adm));
		
		
	}

}
