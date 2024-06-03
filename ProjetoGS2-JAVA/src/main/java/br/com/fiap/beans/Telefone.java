package br.com.fiap.beans;

public class Telefone {

	private int id;
	private String ddd, numero;
	public Telefone() {
		super();
	}
	public Telefone(int id, String ddd, String numero) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", getId()=" + getId() + ", getDdd()="
				+ getDdd() + ", getNumero()=" + getNumero() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
