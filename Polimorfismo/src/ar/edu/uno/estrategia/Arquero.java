package ar.edu.uno.estrategia;

public class Arquero extends Unidad {
	private int cantidadDeFlechas;
	
	public Arquero(Punto posicion) {
		super(5,50,posicion);
		this.cantidadDeFlechas = 20;
	}
	
	public void recargarFlechas() {
		this.cantidadDeFlechas += 6;
	}
	
	public boolean tieneFlechas() {
		return (cantidadDeFlechas>0);
	}
	
	public int getCantidadFlechas() {
		return this.cantidadDeFlechas;
	}
	
	@Override
	public boolean puedoAtacar(Unidad u) {	
		return (this.estoyVivo() 
				&& u.estoyVivo() 
				&& this.tieneFlechas()
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)>=2
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)<=5);
	}
	
	@Override
	public void atacar(Unidad u) {
		if (this.puedoAtacar(u)) {
			this.cantidadDeFlechas -= 1;
			u.recibirDano(this.dano);
		}
	}

}
