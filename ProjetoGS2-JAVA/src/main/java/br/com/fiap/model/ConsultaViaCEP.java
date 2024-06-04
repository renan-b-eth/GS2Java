package br.com.fiap.model;

public class ConsultaViaCEP {
	private String cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi;

	public ConsultaViaCEP() {
		super();
	}

	public ConsultaViaCEP(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			String ibge, String gia, String ddd, String siafi) {
		
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}

	@Override
	public String toString() {
		return "ConsultaCNPJ [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge + ", gia=" + gia + ", ddd="
				+ ddd + ", siafi=" + siafi + ", getCep()=" + getCep() + ", getLogradouro()=" + getLogradouro()
				+ ", getComplemento()=" + getComplemento() + ", getBairro()=" + getBairro() + ", getLocalidade()="
				+ getLocalidade() + ", getUf()=" + getUf() + ", getIbge()=" + getIbge() + ", getGia()=" + getGia()
				+ ", getDdd()=" + getDdd() + ", getSiafi()=" + getSiafi() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	
	

	

}
