package deber.metodos.string;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int op=teclado.nextInt();
		String cedula=teclado.nextLine();
		String cedulaBusqueda=teclado.nextLine();
		System.out.println("************************************");
		System.out.println("       1.Ingresar Estudiante        ");
		System.out.println("       2.Buscar Estudiante          ");
		System.out.println("       3.Salir                      ");
		System.out.println("************************************");
		op = teclado.nextInt();
	
		do {
			
			if (op == 1) {
				System.out.println("Ingrese cedula del estudiante");
				cedula=teclado.nextLine();
			}
			 if(op == 2) {
				System.out.println("Ingrese cedula a buscar");
				cedulaBusqueda=teclado.nextLine();
				if (cedula.equals(cedulaBusqueda)) {
					System.out.println("Existe el estudiante");
				} else {
					System.out.println("No existe el estudiante");
				}
				
			} if(op==3) {

				System.out.println("Sistema cerrado");
				
			}
			op=teclado.nextInt();
		} while (op == 3);

		String Vector[] = new String[5];
			Vector[0]=cedula;
			Vector[1]=cedula;
			Vector[2]=cedula;
			Vector[3]=cedula;
			Vector[4]=cedula;
			

	}

}
