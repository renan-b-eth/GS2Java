package br.com.fiap.model;

public class ConsultaFrase {
	private String id, text, language;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ConsultaFrase [id=" + id + ", text=" + text + ", language=" + language + ", getId()=" + getId()
				+ ", getText()=" + getText() + ", getLanguage()=" + getLanguage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public ConsultaFrase(String id, String text, String language) {
		super();
		this.id = id;
		this.text = text;
		this.language = language;
	}

	public ConsultaFrase() {
		super();
	}
	
	

	
}
