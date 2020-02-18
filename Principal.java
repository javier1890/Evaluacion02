package evaluacion02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Electrodomestico> electro=new ArrayList<Electrodomestico>();
    
    
    //double carga,String color, char ce, double peso, double precio
    Lavadora l1=new Lavadora(45, "blanco", 'B', 5);
    Lavadora l2=new Lavadora(15, "negro", 'B', 5);
    Lavadora l3=new Lavadora(10, "azul", 'z', 5);
    Lavadora l4=new Lavadora(55, "gris", 'B', 5);
    Television t1=new Television(20, false, "amarillo", 'D', 15);
    Television t2=new Television(10, true, "morado", 'A', 33);
    Television t3=new Television(23, false, "rojo", 'F', 34);
    Television t4=new Television(50, true, "amarillo", 'A', 34);
    Television t5=new Television(22, true, "rojo", 'z', 31);
    Television t6=new Television(58, false, "rojo", 'A', 34);
    electro.add(l1);
    electro.add(l2);
    electro.add(l3);
    electro.add(l4);
    electro.add(t1);
    electro.add(t2);
    electro.add(t3);
    electro.add(t4);
    electro.add(t5);
    electro.add(t6);

		
    //int resolucion, Boolean sincronizador, String color, char ce, double peso, double precio
		int i=0,j=0;
		double sumaTelevisor=0,sumaLavadora=0;
		for (int x=0;x<electro.size();x++) {
			if (electro.get(x) instanceof Television) {
				++i;
				sumaTelevisor+=electro.get(x).precioFinal();
				System.out.println(x+")"+electro.get(x).toString());
			}else {
				++j;
				sumaLavadora+=electro.get(x).precioFinal();
				System.out.println(x+")"+electro.get(x).toString());
			}
			
		}
		System.out.println("los televisores son en total "+i+", y el total de la suma de televisores es "+sumaTelevisor);
		System.out.println("las lavadoras son en total "+j+" ,y el total de la suma de las lavadoras es "+sumaLavadora);
	}

}