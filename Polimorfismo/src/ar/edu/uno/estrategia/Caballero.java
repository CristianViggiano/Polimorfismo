package ar.edu.uno.estrategia;

public class Caballero extends Unidad {
private Caballo caballo;
private int contadorDeAtaques = 0;
	
	public Caballero(Punto posicion, Caballo pony) {
		super(50, 200,posicion);
		this.caballo=pony;
	}
	
	public int getContadorDeAtaques() {
		return this.contadorDeAtaques;
	}
	
	public void darAguaCaballo() {
		this.contadorDeAtaques=0;
		this.caballo.beberAgua();
	}

	
	@Override
	public boolean puedoAtacar(Unidad u) {	
		return (this.estoyVivo() 
				&& u.estoyVivo() 
				&& !caballo.estaRevelde()
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)>=1
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)<=2);	
	}
	
	@Override
	public void atacar(Unidad u) {
		if (!this.puedoAtacar(u)) {
			throw new Error("No puede atacar!");
		}
		this.contadorDeAtaques++;
		if (this.contadorDeAtaques==3) this.caballo.setRevelde();
		u.recibirDano(this.dano);
	}

}
