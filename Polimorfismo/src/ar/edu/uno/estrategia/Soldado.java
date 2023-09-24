package ar.edu.uno.estrategia;

public class Soldado extends Unidad implements Bebedor {
	private int energia;
	
	public Soldado(Punto posicion) {
		super(10, 200,posicion);
		this.energia=100;
	}
	
	public int getEnergia() {
		return this.energia;
	}
	
	public boolean energiaSuficiente() {
		return energia>=10 ? true : false;
	}
	
	@Override
	public void beberAgua() {
		this.energia = 100;		
	}
	
	@Override
	public boolean puedoAtacar(Unidad u) {
		return (this.estoyVivo() 
				&& u.estoyVivo() 
				&& energia>=10 
				&& u.posicion.distanciaEntreDosPuntos(this.posicion)<=1);
			
	}
	
	@Override
	public void atacar(Unidad u) {
		if (this.puedoAtacar(u)) {
			this.energia -= 10;
			u.recibirDano(this.dano);
		}
	}

}
