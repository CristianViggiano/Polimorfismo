package ar.edu.uno.estrategia;

public class Caballo implements Bebedor {
	private boolean revelde = false;
	
	public boolean estaRevelde() {
		return revelde;
	}
	
	@Override
	public void beberAgua() {
		this.revelde = false;		
	}

	public void setRevelde() {
		this.revelde = true;		
	}

}
