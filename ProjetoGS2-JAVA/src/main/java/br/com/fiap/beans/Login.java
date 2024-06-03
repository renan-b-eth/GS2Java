package br.com.fiap.beans;

public class Login {
	private int id, id_usuario, id_admin, id_maps;
	private String email, senha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getId_admin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	public int getId_maps() {
		return id_maps;
	}
	public void setId_maps(int id_maps) {
		this.id_maps = id_maps;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", id_usuario=" + id_usuario + ", id_admin=" + id_admin + ", id_maps=" + id_maps
				+ ", email=" + email + ", senha=" + senha + ", getId()=" + getId() + ", getId_usuario()="
				+ getId_usuario() + ", getId_admin()=" + getId_admin() + ", getId_maps()=" + getId_maps()
				+ ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Login(int id, int id_usuario, int id_admin, int id_maps, String email, String senha) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_admin = id_admin;
		this.id_maps = id_maps;
		this.email = email;
		this.senha = senha;
	}
	public Login() {
		super();
	}
	
	

}
