package correccion.prueba;

import java.util.Scanner;

public class Correcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String claveIngresada;
		String opcionMenu;
		int saldoInicial=2500;
		do {
			System.out.println("Ingrese clave");
			Scanner teclado = new Scanner(System.in);
			Scanner teclado1 = new Scanner(System.in);

			claveIngresada = teclado.nextLine();

			if (claveIngresada.equals("85DB")) {
				do {
				System.out.println("BANCO PICHINCHA elija opcion");
				System.out.println("1.consultar pagos");
				System.out.println("2.hacer transferencia");
				System.out.println("3.SALIR");
				opcionMenu=teclado.nextLine();
				if(opcionMenu.equals("1")) {
					System.out.println("No tiene ningun pago pendiente");
				}else if(opcionMenu.equals("2")) {
					System.out.println("Ingrese la cuenta de destino");
					String cuenta=teclado.nextLine();
					System.out.println("Ingrese monto a transferir");
					int monto=teclado1.nextInt();
					saldoInicial=saldoInicial-monto;
					System.out.println("Su nuevo saldo es:"+saldoInicial);
					
				}
				}while(!opcionMenu.equals("3"));//
				claveIngresada="0";

			} else {
				System.out.println("La clave no es correcta");

			}
		} while (!claveIngresada.equals("-1")); //
		System.out.println("Gracias por preferirnos");
	}

}
