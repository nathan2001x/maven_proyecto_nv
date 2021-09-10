package deber.consultorio;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		String nombre = "";
		String apellido = "";
		String sintoma = "";
		String edad = "";

		do {
			System.out.println("**********************");
			System.out.println("     BIENVENIDO       ");
			System.out.println("1. Registrar Paciente ");
			System.out.println("2. Imprimir Reporte   ");
			System.out.println("3. Salir              ");
			System.out.println("**********************");
			opcion = teclado.nextInt();
		if (opcion == 1) {
			System.out.println("Ingrese nombre");
			nombre = teclado.nextLine();
			Pacientes p1 = new Pacientes();
			p1.setNombre(nombre);
			System.out.println("Ingrese apellido");
			apellido=teclado.nextLine();
			Pacientes p2 = new Pacientes();
			p2.setApellido(apellido);
			System.out.println("Ingrese edad");
			edad=teclado.nextLine();
			Pacientes p3 = new Pacientes();
			p3.setEdad(edad);
			System.out.println("Ingrese sintoma");
			sintoma=teclado.nextLine();
			Pacientes p4 = new Pacientes();
			p4.setSintoma(sintoma);

		} else if (opcion == 2) {
			
			String listado[] = new String[4];
			listado[0] = nombre;
			listado[1] = apellido;
			listado[2] = edad;
			listado[3] = sintoma;

			// Aqui ordeno la lista
			Arrays.sort(listado);
			System.out.println("Pacientes ordenados");
			System.out.println(Arrays.toString(listado));

		}
		
		} while (opcion > 3);
		
		
	}
}
