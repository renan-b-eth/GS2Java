package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.beans.Admin;
import br.com.fiap.conexoes.ConexaoFactory;

public class AdminDAO {
	
	public Connection minhaConexao;
	
	public AdminDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert 
			public String inserir (Admin admin) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement
						("Insert into BL_ADMIN values (?, ?, ?, ?, ? ,?, ?");
					stmt.setInt(1, admin.getId());
					stmt.setString(2, admin.getNome());
					stmt.setString(3, admin.getSobrenome());
					stmt.setString(4, admin.getSexo());
					stmt.setString(5, admin.getCargo());
					stmt.setInt(6, admin.getId_endereco());
					stmt.setInt(7, admin.getId_telefone());
					stmt.execute();
					stmt.close();			
				return "Cadastrado com Sucesso!";
			}

			// Select 
			public List<Admin> selecionar() throws SQLException{
				List<Admin> listaAdmin = new ArrayList<Admin>();
				PreparedStatement stmt = minhaConexao.prepareStatement
						("SELECT * FROM BL_ADMIN");
				
					ResultSet rs = stmt.executeQuery();
					
					while(rs.next()) {
						Admin admin = new Admin();
						admin.setId(rs.getInt(1));
						admin.setNome(rs.getString(2));
						admin.setSobrenome(rs.getString(3));
						admin.setSexo(rs.getString(4));
						admin.setCargo(rs.getString(5));
						admin.setId_endereco(rs.getInt(6));
						admin.setId_telefone(rs.getInt(7));
						
						listaAdmin.add(admin);
					}		
				return listaAdmin;		
			}
}
