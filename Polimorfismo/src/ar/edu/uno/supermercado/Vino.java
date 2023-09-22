package ar.edu.uno.supermercado;

import java.time.LocalDate;

public class Vino extends Producto implements EsLiquido, EsAlimento, ConDescuento{

	private String tipoVino;
	private double gradosDeAlcohol;
	private double descuento;
	private LocalDate caducidad;
	private double volumen;
	private String tipoEnvase;
	
	public Vino(String marca, double precio, String tipoVino, double gradosDeAlcohol, double descuento) {
		super(marca, precio);
		this.tipoVino = tipoVino;
		this.gradosDeAlcohol = gradosDeAlcohol;
		this.caducidad = LocalDate.MAX;
	}
		
	public String getTipo() {
		return tipoVino;
	}

	public void setTipo(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public double getGradosDeAlcohol() {
		return gradosDeAlcohol;
	}

	public void setGradosDeAlcohol(double gradosDeAlcohol) {
		this.gradosDeAlcohol = gradosDeAlcohol;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;	
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return (this.getPrecio() - (this.getPrecio() * this.getDescuento()/100));
	}

	@Override
	public void setVolumen(double v) {
		this.volumen = v;
		
	}

	@Override
	public double getVolumen() {
		return this.volumen;
	}

	@Override
	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;
		
	}

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}
	
	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.caducidad;
	}

	@Override
	public int getCalorias() {
		return (int)(this.getGradosDeAlcohol() * 10);
	}

	@Override
	public String toString() {
		return "Vino " + super.toString() + ", Tipo: " + getTipo()
				+ ", Graduacion Alcohol: " + getGradosDeAlcohol() + ", Descuento: " + getDescuento()
				+ ", Precio con Descuento: " + getPrecioDescuento() + ", Volumen: " + getVolumen()
				+ ", Tipo de Envase: " + getTipoEnvase() + "]";
	}


}
