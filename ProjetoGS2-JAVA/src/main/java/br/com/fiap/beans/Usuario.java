package br.com.fiap.beans;

public class Usuario {
	private int id, id_endereco, id_telefone;
	private String nome, sobrenome, sexo;
	public Usuario(int id, int id_endereco, int id_telefone, String nome, String sobrenome, String sexo) {
		super();
		this.id = id;
		this.id_endereco = id_endereco;
		this.id_telefone = id_telefone;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public int getId_telefone() {
		return id_telefone;
	}
	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_endereco=" + id_endereco + ", id_telefone=" + id_telefone + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", sexo=" + sexo + ", getSexo()=" + getSexo() + ", getId()=" + getId()
				+ ", getId_endereco()=" + getId_endereco() + ", getId_telefone()=" + getId_telefone() + ", getNome()="
				+ getNome() + ", getSobrenome()=" + getSobrenome() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Usuario(int id, int id_endereco, int id_telefone, String nome, String sobrenome) {
		super();
		this.id = id;
		this.id_endereco = id_endereco;
		this.id_telefone = id_telefone;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Usuario() {
		super();
	}
	

}
