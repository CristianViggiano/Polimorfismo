package ar.edu.uno.servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
	private int numeroAlarmas;
	
	public RevisionAlarma(LocalDate fechaInicio, String cliente, int numeroAlarmas) {
		super("Revisor Especialista Contraincendios", fechaInicio, cliente);
		this.numeroAlarmas = numeroAlarmas;
	}
	
	public void setNumeroAlarma(int numeroAlarmas) {
		this.numeroAlarmas = numeroAlarmas;
	}
	
	public int getNumeroAlarma() {
		return numeroAlarmas;
	}
	
	@Override
	public double costeMaterial() {
		return 0;
	}
	
	@Override
	public double costeManoObra() {
		return Math.round((numeroAlarmas / 3)*40*100)/100;
	}
	
	@Override
	public double costeTotal() {
		return costeManoObra();
	}
	
	@Override
	public String detalleServicio() {
		return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS\n" +
				"Cliente: " + getCliente() + "\n" +
				"Fecha revision: " + getFechaInicio() + "\n" +
				"-----------------------------------------\n" +
				"TOTAL:................ " + costeTotal() + "\n" +
				"-----------------------------------------\n";
	}

}
