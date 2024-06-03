package br.com.fiap.beans;

public class IA2 {
	private int id;
	private String cidade, regiao, ent_qa, poluicao_agua;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getEnt_qa() {
		return ent_qa;
	}
	public void setEnt_qa(String ent_qa) {
		this.ent_qa = ent_qa;
	}
	public String getPoluicao_agua() {
		return poluicao_agua;
	}
	public void setPoluicao_agua(String poluicao_agua) {
		this.poluicao_agua = poluicao_agua;
	}
	public IA2(int id, String cidade, String regiao, String ent_qa, String poluicao_agua) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.regiao = regiao;
		this.ent_qa = ent_qa;
		this.poluicao_agua = poluicao_agua;
	}
	public IA2() {
		super();
	}
	@Override
	public String toString() {
		return "IA2 [id=" + id + ", cidade=" + cidade + ", regiao=" + regiao + ", ent_qa=" + ent_qa + ", poluicao_agua="
				+ poluicao_agua + ", getId()=" + getId() + ", getCidade()=" + getCidade() + ", getRegiao()="
				+ getRegiao() + ", getEnt_qa()=" + getEnt_qa() + ", getPoluicao_agua()=" + getPoluicao_agua()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
