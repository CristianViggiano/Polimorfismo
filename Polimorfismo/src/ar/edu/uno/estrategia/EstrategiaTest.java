package ar.edu.uno.estrategia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstrategiaTest {

	@Test
	void soldadoTest() {
		Soldado rambo = new Soldado(new Punto(3,3));
		Soldado conan = new Soldado(new Punto(3,3));
		rambo.atacar(conan);
		rambo.atacar(conan);
		
		assertEquals(80, rambo.getEnergia());
		assertEquals(180, conan.getSalud());
		
		while(conan.estoyVivo()) {
			System.out.println("Ataca Rambo - Energia;: " + rambo.getEnergia() +
					" Salud: " + rambo.getSalud());
			if(!rambo.energiaSuficiente()) {
				System.out.println("Rambo Bebio agua!!!");
				rambo.beberAgua();
			}
			rambo.atacar(conan);
			System.out.println("Conan - Energia;: " + conan.getEnergia() +
					" Salud: " + conan.getSalud());
		}
		assertFalse(conan.estoyVivo());
		System.out.println("--------------");
		System.out.println("--------------");
		
	}
	
	@Test
	void arqueroTest() {
		Arquero ashe = new Arquero(new Punto(1,3));
		Soldado conan = new Soldado(new Punto(3,3));
		ashe.atacar(conan);
		ashe.atacar(conan);
		
		assertEquals(18, ashe.getCantidadFlechas());
		assertEquals(190, conan.getSalud());
		
		while(conan.estoyVivo()) {
			System.out.println("Ataca Ashe - Flechas;: " + ashe.getCantidadFlechas() +
					" Salud: " + ashe.getSalud());
			if(!ashe.tieneFlechas()) {
				System.out.println("Ashe recargo!!!");
				ashe.recargarFlechas();
			}
			ashe.atacar(conan);
			System.out.println("Conan - Energia;: " + conan.getEnergia() +
					" Salud: " + conan.getSalud());
		}
		assertFalse(conan.estoyVivo());
		System.out.println("--------------");
		System.out.println("--------------");
	}

	@Test
	void caballeroTest() {
		Caballo tornado = new Caballo();
		Caballero juan = new Caballero(new Punto(2,3), tornado);
		Soldado conan = new Soldado(new Punto(3,3));
		juan.atacar(conan);
		juan.atacar(conan);
		juan.atacar(conan);
		
		
		assertEquals(true, tornado.estaRevelde());
		assertEquals(50, conan.getSalud());
		
		if(tornado.estaRevelde()) {
			System.out.println("juan le dio agua al caballo!!!");
			juan.darAguaCaballo();
		}
		
		while(conan.estoyVivo()) {
			System.out.println("Ataca juan - Cantidad de Ataques: " + juan.getContadorDeAtaques() +
					" Salud: " + juan.getSalud());
			if(tornado.estaRevelde()) {
				System.out.println("juan le dio agua al caballo!!!");
				juan.darAguaCaballo();
			}
			juan.atacar(conan);
			System.out.println("Conan - Energia;: " + conan.getEnergia() +
					" Salud: " + conan.getSalud());
		}
		
		assertFalse(conan.estoyVivo());
		System.out.println("--------------");
		System.out.println("--------------");
	}
	
	

}
