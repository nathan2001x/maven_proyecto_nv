package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String opcion;
		do {
		System.out.println("Escoja opcion");
		System.out.println("1. Realizar Transferencia");
		System.out.println("2. Consultar Pagos");
		System.out.println("3. Salir");
		opcion=teclado.nextLine();
		
		if(opcion.equals("1")) {
			System.out.println("Ingrese el numero de cuenta");
		}else if(opcion.equals("2")) {
			System.out.println("No existen pagos");
		}
		
		}while(!opcion.equals("3"));// similar a : opcion!=3
		System.out.println("Gracias por preferirnos");
	}
	
}
