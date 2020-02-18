package evaluacion02;

import java.util.LinkedList;
import java.util.List;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
    List<Electrodomestico> electro=new LinkedList<Electrodomestico>();
    
    
    //double carga,String color, char ce, double peso, double precio
    Lavadora l1=new Lavadora(45, "blanco", 'B', 5, 30000);
    Lavadora l2=new Lavadora(15, "negro", 'B', 5, 5800);
    Lavadora l3=new Lavadora(10, "azul", 'z', 5, 35500);
    Lavadora l4=new Lavadora(55, "gris", 'B', 5, 8000);
//    electro.add(l1);
//    electro.add(l2);
//    electro.add(l3);
//    electro.add(l4);
    
    
    //int resolucion, Boolean sincronizador, String color, char ce, double peso, double precio
    Television t1=new Television(20, true, "amarillo", 'z', 34, 8000);
    Television t2=new Television(10, true, "morado", 'z', 34, 5600);
    Television t3=new Television(23, true, "rojo", 'z', 34, 88000);
    Television t4=new Television(50, true, "amarillo", 'z', 34, 60000);
    electro.add(t1);
    electro.add(t2);
    electro.add(t3);
    electro.add(t4);

		
		
		for (Electrodomestico e : electro) {
			System.out.println(e);
		}

	}

}
