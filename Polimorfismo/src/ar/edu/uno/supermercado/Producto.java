package ar.edu.uno.supermercado;

public abstract class Producto {
	private String marca;
	private double precio;
	
	public Producto(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Marca: " + this.marca + ", Precio: " + this.precio;
	}

}
