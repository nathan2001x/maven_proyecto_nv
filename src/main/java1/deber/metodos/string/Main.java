package deber.metodos.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*************************************************");
		System.out.println("       1.Ingresar Estudiante                     ");
		System.out.println("       2.Buscar Estudiante                       ");
		System.out.println("       3.Sair                                    ");
		System.out.println("*************************************************");
		
		int opcion=teclado.nextInt();
		String cedula = "";

		Estudiantes fila[] = new Estudiantes[5];

		Estudiantes juan = new Estudiantes();
		juan.setCedula(cedula);
		juan.setNombre("Juan");

		Estudiantes pablo = new Estudiantes();
		pablo.setCedula(cedula);
		pablo.setNombre("Pablo");

		Estudiantes pedro = new Estudiantes();
		pedro.setCedula(cedula);
		pedro.setNombre("Pedro");

		Estudiantes paul = new Estudiantes();
		paul.setCedula(cedula);
		paul.setNombre("Paul");

		Estudiantes cris = new Estudiantes();
		cris.setCedula(cedula);
		cris.setNombre("Cris");
		
		

		do {
			
			if (opcion == 1) {
				System.out.println("Ingrese Cedula del estudiante");
				cedula = teclado.nextLine();
				
			} else if (opcion == 2) {
				System.out.println("Ingrese Cedula a buscar");
				cedula = teclado.nextLine();
				for (int i = 0; i < 5; i++) {
					Estudiantes estudiante = fila[i];
					String cedulaObtenida = estudiante.getCedula();
					if (cedula.equals(cedulaObtenida)) {
						System.out.println("El estudiante esta registrado");
					} else {
						System.out.println("El estudiante no esta registrado");
					}
				}
			}
			

		} while (opcion != 3);

		fila[0] = juan;
		fila[1] = pablo;
		fila[2] = pedro;
		fila[3] = paul;
		fila[4] = cris;

	}

}
