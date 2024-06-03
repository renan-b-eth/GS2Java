package br.com.fiap.beans;

public class IA1 {
	private int id;
	private String entidade, codigo, ano, part_reg, part_oma, part_lx;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntidade() {
		return entidade;
	}
	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPart_reg() {
		return part_reg;
	}
	public void setPart_reg(String part_reg) {
		this.part_reg = part_reg;
	}
	public String getPart_oma() {
		return part_oma;
	}
	public void setPart_oma(String part_oma) {
		this.part_oma = part_oma;
	}
	public String getPart_lx() {
		return part_lx;
	}
	public void setPart_lx(String part_lx) {
		this.part_lx = part_lx;
	}
	@Override
	public String toString() {
		return "IA1 [id=" + id + ", entidade=" + entidade + ", codigo=" + codigo + ", ano=" + ano + ", part_reg="
				+ part_reg + ", part_oma=" + part_oma + ", part_lx=" + part_lx + ", getId()=" + getId()
				+ ", getEntidade()=" + getEntidade() + ", getCodigo()=" + getCodigo() + ", getAno()=" + getAno()
				+ ", getPart_reg()=" + getPart_reg() + ", getPart_oma()=" + getPart_oma() + ", getPart_lx()="
				+ getPart_lx() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public IA1(int id, String entidade, String codigo, String ano, String part_reg, String part_oma, String part_lx) {
		super();
		this.id = id;
		this.entidade = entidade;
		this.codigo = codigo;
		this.ano = ano;
		this.part_reg = part_reg;
		this.part_oma = part_oma;
		this.part_lx = part_lx;
	}
	public IA1() {
		super();
	}
	
	

}
