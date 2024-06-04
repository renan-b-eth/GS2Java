package br.com.fiap.model;

public class ConsultaElevacao {
	private String results, dataset, elevation, location, lat, lng, status;

	public ConsultaElevacao(String results, String dataset, String elevation, String location, String lat, String lng,
			String status) {
		super();
		this.results = results;
		this.dataset = dataset;
		this.elevation = elevation;
		this.location = location;
		this.lat = lat;
		this.lng = lng;
		this.status = status;
	}

	public ConsultaElevacao() {
		super();
	}

	@Override
	public String toString() {
		return "ConsultaElevacao [results=" + results + ", dataset=" + dataset + ", elevation=" + elevation
				+ ", location=" + location + ", lat=" + lat + ", lng=" + lng + ", status=" + status + ", getResults()="
				+ getResults() + ", getDataset()=" + getDataset() + ", getElevation()=" + getElevation()
				+ ", getLocation()=" + getLocation() + ", getLat()=" + getLat() + ", getLng()=" + getLng()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
