package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		// switch antes de la version 1.7 solo funcionaba para byte ,short char e int

		String opcion;
		do {
			System.out.println("Escoja opcion");
			System.out.println("1. Realizar Transferencia");
			System.out.println("2. Consultar Pagos");
			System.out.println("3. Salir");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese numero de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
				break;
			default:
				System.out.println("No a elegido ninguna opcion valida");
				break; // opcional

			}

		} while (!opcion.equals("3"));// similar a : opcion!=3
		System.out.println("Gracias por preferirnos");
	}

}
