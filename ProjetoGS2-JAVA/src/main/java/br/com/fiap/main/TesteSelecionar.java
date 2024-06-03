package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.AdminDAO;
import br.com.fiap.dao.UsuarioDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		
		UsuarioDAO dao2 = new UsuarioDAO();
		AdminDAO dao = new AdminDAO();
		
		List<Usuario> listaUsuario = (ArrayList<Usuario>) dao2.selecionar();
		List<Admin> listaAdmin = (ArrayList<Admin>) dao.selecionar();
		
		/*if(listaUsuario != null) {
			// foreach 
			for( Usuario usuario : listaUsuario) {
				System.out.println(usuario.getId() + " " + 
						usuario.getNome() + " " + 
						usuario.getSobrenome() + " " + 
						usuario.getSexo() + " " + usuario.getId_endereco() + " " + usuario.getId_telefone());
			}
		}*/
		
		if(listaAdmin != null) {
			// foreach 
			for( Admin admin : listaAdmin) {
				System.out.println(admin.getId() + " " + 
						admin.getNome() + " " + 
						admin.getSobrenome() + " " + 
						admin.getSexo() + " " + admin.getCargo() + " " + admin.getId_endereco() + " " + admin.getId_telefone());
			}
		}

	}

}
