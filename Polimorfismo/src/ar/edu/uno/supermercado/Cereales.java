package ar.edu.uno.supermercado;

import java.time.LocalDate;

public class Cereales extends Producto implements EsAlimento{
	
	private TipoCereal tipoCereal;
	private LocalDate caducidad;
	

	public Cereales(String marca, double precio, TipoCereal tipoCereal) {
		super(marca, precio);
		this.tipoCereal = tipoCereal;
		this.caducidad = LocalDate.MAX;
	}
	
	public TipoCereal getTipo() {
		return tipoCereal;
	}

	public void setTipo(TipoCereal tipoCereal) {
		this.tipoCereal = tipoCereal;
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
		return this.tipoCereal.getCalorias();
	}

	@Override
	public String toString() {
		return "Cereales " + super.toString() + ", Tipo: " + getTipo()
				+ ", Vencimiento: " + getCaducidad() + ", Calorias: " + getCalorias() + "]";
	}
	

}
