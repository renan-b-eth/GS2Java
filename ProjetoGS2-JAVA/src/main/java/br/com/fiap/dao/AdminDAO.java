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
						("Insert into BL_ADMIN values (?, ?, ?, ?, ?, ?, ?, ?)");
					stmt.setInt(1, admin.getId());
					stmt.setString(2, admin.getNome());
					stmt.setString(3, admin.getSobrenome());
					stmt.setString(4, admin.getSexo());
					stmt.setString(5, admin.getCargo());
					stmt.setString(6, admin.getEmail());
					stmt.setString(7, admin.getSenha());
					stmt.setString(8, admin.getSenha2());
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
						/*admin.setId(rs.getInt(1));*/
						admin.setNome(rs.getString(1));
						admin.setSobrenome(rs.getString(2));
						admin.setSexo(rs.getString(3));
						admin.setCargo(rs.getString(4));
						admin.setEmail(rs.getString(5));
						admin.setSenha(rs.getString(6));
						admin.setSenha2(rs.getString(7));
						
						listaAdmin.add(admin);
					}		
				return listaAdmin;		
			}
			// Delete
			public String deletar(int id) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement
						("Delete from BL_ADMIN where ID_ADMIN = ?");
					stmt.setInt(1, id);
					stmt.execute();
					stmt.close();		
				return "Deletado com Sucesso!";
			}
			// UpDate 
			public String atualizar(Admin admin) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement
						(" Update BL_ADMIN set NOME_ADMIN = ?, SOBRENOME_ADMIN = ?, where ID_ADMIN = ?");
						stmt.setInt(1, admin.getId());
						stmt.setString(2, admin.getNome());
						stmt.setString(3, admin.getSobrenome());
						stmt.executeUpdate();
						stmt.close();	
				return "Atualizado com Sucesso!";
			}
}
