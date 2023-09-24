package ar.edu.uno.estrategia;

public class Lancero extends Unidad {
	public Lancero(Punto posicion) {
		super(25,150,posicion);
	}
	
	@Override
	public boolean puedoAtacar(Unidad u) {	
		return (this.estoyVivo() 
				&& u.estoyVivo() 
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)>=1
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)<=3);	
	}
	
	@Override
	public void atacar(Unidad u) {
		if (this.puedoAtacar(u)) {
			u.recibirDano(this.dano);
		}
	}
}
