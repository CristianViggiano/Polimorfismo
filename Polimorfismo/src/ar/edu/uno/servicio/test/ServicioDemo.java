package ar.edu.uno.servicio.test;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.uno.servicios.*;

public class ServicioDemo {
	

	public static void main(String[] args) {
		double total = 0;
		double salario = 0;
		// Creacion de trabajos de pintura
		TrabajoPintura pinturaCasa = new TrabajoPintura("Juan",LocalDate.of(2023,7,2),"Pepe",49.5,130.0);
		TrabajoPintura pinturaEscuela = new TrabajoPintura("Pedro",LocalDate.of(2023,8,22),"EETN3",860.0,130.0);
		// Creacion de trabajos revision de alarmas
		RevisionAlarma alarmaCasa = new RevisionAlarma(LocalDate.of(2023,7,22),"Pepe",8);
		RevisionAlarma alarmaEscuela = new RevisionAlarma(LocalDate.of(2023,9,15),"EETN3",79);
		
		//ArrayList
		ArrayList<Servicio> listaDeServicios = new ArrayList<Servicio>();
		listaDeServicios.add(pinturaCasa);
		listaDeServicios.add(pinturaEscuela);
		listaDeServicios.add(alarmaCasa);
		listaDeServicios.add(alarmaEscuela);
	
		
		for(Servicio s : listaDeServicios) {
			System.out.println(s.detalleServicio());
			total += s.costeTotal();
			salario += s.costeManoObra();
		}
		System.out.printf("TOTAL DE TODOS LOS TRABAJOS: %.2f\n", total);
		System.out.printf("TOTAL SUELDOS: %.2f\n", salario);
			
			
			
		

	}

}
