package ar.edu.uno.supermercado;

public class Detergente extends Producto implements EsLiquido,ConDescuento{
	
	private double descuento;
	
	public Detergente(String marca, double precio, double descuento) {
		super(marca, precio);
		this.descuento = descuento;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;	
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return (this.getPrecio() - (this.getPrecio() * this.getDescuento()/100));
	}
	
	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Detergente " + super.toString() + ", Descuento: "
				+ getDescuento() + ", Precio con Descuento: " + getPrecioDescuento()
				+ ", Volumen: " + getVolumen()
				+ ", Tipo de Envase: " + getTipoEnvase() + "]";
	}
	
	
	
	
}
