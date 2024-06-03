package br.com.fiap.beans;

public class Maps {
	
	private int id, id_ia, id_ia2;
	public Maps() {
		super();
	}
	public Maps(int id, int id_ia, int id_ia2, String nome, String local, String bioma_ibge, String bioma_crl) {
		super();
		this.id = id;
		this.id_ia = id_ia;
		this.id_ia2 = id_ia2;
		this.nome = nome;
		this.local = local;
		this.bioma_ibge = bioma_ibge;
		this.bioma_crl = bioma_crl;
	}
	@Override
	public String toString() {
		return "Maps [id=" + id + ", id_ia=" + id_ia + ", id_ia2=" + id_ia2 + ", nome=" + nome + ", local=" + local
				+ ", bioma_ibge=" + bioma_ibge + ", bioma_crl=" + bioma_crl + ", getId()=" + getId() + ", getId_ia()="
				+ getId_ia() + ", getId_ia2()=" + getId_ia2() + ", getNome()=" + getNome() + ", getLocal()="
				+ getLocal() + ", getBioma_ibge()=" + getBioma_ibge() + ", getBioma_crl()=" + getBioma_crl()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_ia() {
		return id_ia;
	}
	public void setId_ia(int id_ia) {
		this.id_ia = id_ia;
	}
	public int getId_ia2() {
		return id_ia2;
	}
	public void setId_ia2(int id_ia2) {
		this.id_ia2 = id_ia2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getBioma_ibge() {
		return bioma_ibge;
	}
	public void setBioma_ibge(String bioma_ibge) {
		this.bioma_ibge = bioma_ibge;
	}
	public String getBioma_crl() {
		return bioma_crl;
	}
	public void setBioma_crl(String bioma_crl) {
		this.bioma_crl = bioma_crl;
	}
	private String nome, local, bioma_ibge, bioma_crl;

}
