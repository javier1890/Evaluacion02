package evaluacion02;

public class Lavadora extends Electrodomestico {

	@SuppressWarnings("unused")
	protected final static double CARGA_LAVADORA=5;
	private double carga;

	public Lavadora() {

		super();
		this.carga=CARGA_LAVADORA;
	}

	public Lavadora(double peso, double precio) {
		super(peso, precio);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double carga,String color, char ce, double peso, double precio) {
		super(color,ce, peso, precio);
		this.carga=carga;
	}
	
	public Lavadora(double carga,String color, char ce, double peso) {
		super(color,ce, peso);
		this.carga=carga;
		
	}
	

	
	
	public static double getCargaLavadora() {
		return CARGA_LAVADORA;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double valor=0;
		double precioLavadora=super.precioFinal();
		
		if (this.getCarga()>30) {
			valor+=precioLavadora+40000;
			this.setPrecio(valor);
			return valor;
		}
		this.setPrecio(precioLavadora);
		return precioLavadora;
		
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga +" ,color="+super.getColor()+" ,peso="+super.getPeso()+" ,precio="+this.precioFinal()+"]";
	}
	

}