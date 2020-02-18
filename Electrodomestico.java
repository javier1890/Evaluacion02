package evaluacion02;

public class Electrodomestico {

	/**
	 * atributis de la clase
	 */
	protected final static double PESO_BASE = 5;
	protected final static char CONSUMO_ENERGETICO = 'F';
	protected final static double PRECIO_BASE_DEFINIDO = 100000;
	protected final static String COLOR_DEFINIDO = "blanco";

	private String color;
	private char ce;
	private double peso;
	private double precio;

	public Electrodomestico() {
		this(COLOR_DEFINIDO, CONSUMO_ENERGETICO, PESO_BASE, PRECIO_BASE_DEFINIDO);
	}

	public Electrodomestico(double peso, double precio) {
		this.peso = peso;
		this.precio = precio;
	}

	public Electrodomestico(String color, char ce, double peso, double precio) {
		this.color = comprobarColor(color);
		this.ce = comprobarConsumoEnergia(ce);
		this.peso = peso;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public char getCe() {
		return ce;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}

	public static double getPesoBase() {
		return PESO_BASE;
	}

	public static char getConsumoEnergetico() {
		return CONSUMO_ENERGETICO;
	}

	public static double getPrecioBaseDefinido() {
		return PRECIO_BASE_DEFINIDO;
	}

	public static String getColorDefinido() {
		return COLOR_DEFINIDO;
	}

	// setters
	public void setColor(String color) {
		this.color = color;
	}

	public void setCe(char ce) {
		this.ce = ce;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * métodos
	 * 
	 * @return
	 */
	public char comprobarConsumoEnergia(char letra) {

		if (Character.toUpperCase(letra) == 'A' || Character.toUpperCase(letra) == 'B'
				|| Character.toUpperCase(letra) == 'C' || Character.toUpperCase(letra) == 'D'
				|| Character.toUpperCase(letra) == 'E' || Character.toUpperCase(letra) == 'F') {

			return Character.toUpperCase(letra);
		} else {

			return CONSUMO_ENERGETICO;
		}

	}

	public String comprobarColor(String color) {

		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {

			return color;

		} else {
			return COLOR_DEFINIDO;
		}
	}

	public double precioFinal() {
		double cost = 0;

		switch (this.ce) {
		case 'A':
			cost += 85000;
			break;
		case 'B':
			cost += 70000;
			break;
		case 'C':
			cost += 50000;
			break;
		case 'D':
			cost += 40000;
			break;
		case 'E':
			cost += 25000;
			break;
		case 'F':
			cost += 8500;
			break;

		}

		if (this.peso >= 0 && this.peso <= 19) {
			cost += 8500;
		} else if (this.peso >= 20 && this.peso <= 49) {
			cost += 40000;

		} else if (this.peso >= 50 && this.peso <= 79) {
			cost += 70000;

		} else if (this.peso > 80) {
			cost += 85000;
		}
		return cost;
	}

	@Override
	public String toString() {
		return "Electrodomestico [color=" + color + ", ce=" + ce + ", peso=" + peso + ", precio=" + precio + "]";
	}

}
