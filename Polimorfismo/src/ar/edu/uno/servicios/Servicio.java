package ar.edu.uno.servicios;

import java.time.LocalDate;

public abstract class Servicio implements InterfaceServicio {
	private String trabajador;
	private LocalDate fechaInicio;
	private String cliente;
	
	public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
		this.trabajador = trabajador;
		this.cliente = cliente;
		this.fechaInicio = fechaInicio;
	}
	
	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;		
	}
	
	public String getTrabajador() {
		return this.trabajador;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
}
