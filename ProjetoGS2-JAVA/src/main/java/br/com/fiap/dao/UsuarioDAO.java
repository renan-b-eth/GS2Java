package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

public class UsuarioDAO {
	
	public Connection minhaConexao;
	
	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert 
		public String inserir (Usuario usuario) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement
					("Insert into BL_USUARIO values (?, ?, ?, ?, ?, ?)");
				stmt.setInt(1, usuario.getId());
				stmt.setString(2, usuario.getNome());
				stmt.setString(3, usuario.getSobrenome());
				stmt.setString(4, usuario.getSexo());
				stmt.setInt(5, usuario.getId_endereco());
				stmt.setInt(6, usuario.getId_telefone());
				stmt.execute();
				stmt.close();			
			return "Cadastrado com Sucesso!";
		}

		// Select 
		public List<Usuario> selecionar() throws SQLException{
			List<Usuario> listaUsuario = new ArrayList<Usuario>();
			PreparedStatement stmt = minhaConexao.prepareStatement
					("SELECT * FROM BL_USUARIO");
			
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					Usuario usuario = new Usuario();
					usuario.setId(rs.getInt(1));
					usuario.setNome(rs.getString(2));
					usuario.setSobrenome(rs.getString(3));
					usuario.setSexo(rs.getString(4));
					usuario.setId_endereco(rs.getInt(5));
					usuario.setId_telefone(rs.getInt(6));
					listaUsuario.add(usuario);
				}		
			return listaUsuario;		
		}
		
		// Delete
		public String deletar(int id) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement
					("Delete from BL_USUARIO where ID_USUARIO = ?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();		
			return "Deletado com Sucesso!";
		}
		// UpDate 
		public String atualizar(Usuario usuario) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement
					(" Update BL_ADMIN set NOME_USUARIO = ?, SOBRENOME_USUARIO = ?, where ID_USUARIO = ?");
					stmt.setString(1, usuario.getNome());
					stmt.setString(2, usuario.getSobrenome());
					stmt.setInt(3, usuario.getId());
					stmt.executeUpdate();
					stmt.close();	
			return "Atualizado com Sucesso!";
		}
		
}
