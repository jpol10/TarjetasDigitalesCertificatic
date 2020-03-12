package org.certificatic.tarjetaDigital.model;

public class Tarjeta {
	
	//GENERAMOS LOS ATRIBUTOS NECESARIO de la tarjeta
	//creamos nuestro pojo por las propiedades de la tarjeta
	
	private String nombreEntidad;
	private String numeroTarjeta;
	private String fechaCaducidad;
	private String nombreTitular;
	private String CVV;
	private MarcaEnum marca;
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public MarcaEnum getMarca() {
		return marca;
	}
	public void setMarca(MarcaEnum marca) {
		this.marca = marca;
	}
	
	
	

}
