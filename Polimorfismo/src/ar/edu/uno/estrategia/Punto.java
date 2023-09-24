package ar.edu.uno.estrategia;

import java.util.Objects;

public class Punto {
	private double x;
	private double y;
	private static int cant; //atributo a la clase y no a cada instancia
	public static final Punto PUNTO_AL_ORIGEN = new Punto(0); //atributo a la clase constante
	
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
		cant++;//Cuento la cantidad de instancias que hay
	}
	
	public Punto(double xy) {
		this(xy, xy);
	}
	
	public Punto() {
		this(2.0, 2.0);
	}
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static int getCant() {
		return cant;
	}
	
	public double distanciaEntreDosPuntos(double x, double y) {
		return distanciaEntreDosPuntos(new Punto(x, y));
	}
	
	public double distanciaEntreDosPuntos(Punto p) {
		return Math.hypot(this.x - p.x, this.y - p.y);
	}
	
	public void desplazar(double enX, double enY) {
		this.x += enX;
		this.y += enY;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public Cuadrante getCuadrante() {
		if (x > 0 && y > 0) return Cuadrante.I;
		if (x > 0 && y < 0) return Cuadrante.IV;
		if (x < 0 && y > 0) return Cuadrante.II;
		if (x < 0 && y < 0) return Cuadrante.III;
		return Cuadrante.SIN_CUADRANTE;
	}
}
