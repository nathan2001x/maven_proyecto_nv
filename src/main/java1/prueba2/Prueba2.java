package prueba2;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		Scanner teclado1=new Scanner(System.in);
		String c;
		int op,ma,m,r;
		do {
		
		
		System.out.println("Ingrese Clave");
		
		c=teclado.nextLine();
		
			
			if(c=="c") {
				System.out.println("     BANCO PICHINCHA     ");
				System.out.println("1.Consultar Pagos        ");
				System.out.println("2.Realizar Transferencia ");
				System.out.println("3.SALIR                  ");
				op=teclado1.nextInt();
				if(op==1) {
					System.out.println("No tiene ningun pago pendiente");
				} else if(op==2) {
					System.out.println("Ingrese cuenta de destino");
					
					System.out.println("Ingrese monto a transferir");
					ma=teclado.nextInt();
					m=2500;
					r=m-ma;
					System.out.println("Su nuevo saldo es: " + r);
				}
			}
			
			System.out.println("La clave no es correcta");
			
		}while(c=="-1");
	
		
		System.out.println("Gracias por preferirnos");

	}

}
