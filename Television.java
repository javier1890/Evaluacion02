package evaluacion02;

public class Television extends Electrodomestico {

	private int resolucion;

	private boolean sincronizador;

	public Television() {
		super();

	}

	public Television(double peso, double precio) {
		super(peso, precio);
		this.resolucion = 20;
		this.sincronizador = false;

	}

	public Television(int resolucion, Boolean sincronizador, String color, char ce, double peso, double precio) {
		super(color, ce, peso, precio);
		this.resolucion = resolucion;
		this.sincronizador = sincronizador;

	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSincronizador() {
		return sincronizador;
	}

	@Override
	public double precioFinal() {
		double valor=0;
		double precioLavadora=super.precioFinal();
		
		if (this.getResolucion()>40) {
			valor+=precioLavadora*1.30;
			
			if (this.isSincronizador()==true) {
				valor+=45000;
			}
			
		}
		
		this.setPrecio(valor);
		return valor;
	}
}
