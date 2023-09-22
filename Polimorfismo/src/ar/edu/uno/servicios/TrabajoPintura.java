package ar.edu.uno.servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
	private double superficie;
	private double precioPintura;
	
	public TrabajoPintura(String trabajador, LocalDate fechaInicio,String cliente, double superficie, double precioPintura) {
		super(trabajador, fechaInicio, cliente);
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;		
	}
	
	public double getSuperficie() {
		return this.superficie;
	}
	
	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}
	
	public double getPrecioPintura() {
		return this.precioPintura;
	}
	
	@Override
	public double costeMaterial() {
		return Math.round((superficie / 7.8)*precioPintura*100)/100;
	}
	
	@Override
	public double costeManoObra() {
		return Math.round((superficie /10)*9.5);
	}
	
	public double costeAdicional() {
		return superficie < 50 ? Math.round(((costeMaterial() + costeManoObra())*0.15)*100)/100 : 0;
	}
	
	@Override
	public double costeTotal() {
		return Math.round((costeMaterial() + costeManoObra() + costeAdicional())*100)/100;
	}
	
	@Override
	public String detalleServicio() {
		return "Cliente: " + getCliente() + "\n" +
				"Fecha de inicio: " + getFechaInicio() + "\n" +
				"-----------------------------------------\n" +
				"Pintor: " + getTrabajador() + "\n" +
				"Coste Material......." + costeMaterial() + "\n" +
				"Coste Mano de Obra..." + costeManoObra() + "\n" +
				"Coste Adicional......" + costeAdicional() + "\n" +
				"TOTAL................" + costeTotal() + "\n" +
				"-----------------------------------------\n";
	}
}