package ar.edu.uno.estrategia;

public abstract class Unidad {
	public int salud;
	public int dano;
	public Punto posicion;
	
	public Unidad(int dano, int salud, Punto posicion) {
		this.dano = dano;
		this.salud = salud;
		this.posicion = posicion;
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	public void recibirDano(int dano) {
		this.salud -= dano;
	}
	
	public boolean estoyVivo() {
		return salud > 0 ? true : false;
	}
	
	public abstract boolean puedoAtacar(Unidad u);
	
	public abstract void atacar(Unidad u);
	
}
