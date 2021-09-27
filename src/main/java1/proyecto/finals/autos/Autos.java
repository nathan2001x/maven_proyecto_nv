package proyecto.finals.autos;

import java.time.LocalDate;

public class Autos {
	private String modelo;
	private String marca;
	private String placa;
	private String anioAuto;
	private String estadoAuto;
	private LocalDate fechaEntrega;
	private String precio;
	private String numeroPuertas;
	private String pesoCamioneta;
	private String pais;
	private String cilindraje;
	
	
	// get y set
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getAnioAuto() {
		return anioAuto;
	}
	public void setAnioAuto(String anioAuto) {
		this.anioAuto = anioAuto;
	}
	public String getEstadoAuto() {
		return estadoAuto;
	}
	public void setEstadoAuto(String estadoAuto) {
		this.estadoAuto = estadoAuto;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public String getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public String getPesoCamioneta() {
		return pesoCamioneta;
	}
	public void setPesoCamioneta(String pesoCamioneta) {
		this.pesoCamioneta = pesoCamioneta;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	@Override
	public String toString() {
		return " [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anioAuto=" + anioAuto
				+ ", estadoAuto=" + estadoAuto + ", fechaEntrega=" + fechaEntrega + "]";
	}
	
	
	
	

}