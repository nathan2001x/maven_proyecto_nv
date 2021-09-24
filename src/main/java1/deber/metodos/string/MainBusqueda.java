package deber.metodos.string;

import java.util.Arrays;
import java.util.Scanner;

public class MainBusqueda extends Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		int i = -1;
		String cedulaIngresada = "";
		Estudiante vector[]=new Estudiante[5]; 
		do {
			System.out.println("Elije una opcion");
			System.out.println("1.Ingresar Estudiante");
			System.out.println("2.Buscar Estudiante");
			System.out.println("3.Salir");
			opcion=teclado.nextInt();
			if(opcion==1) {
				System.out.println("Ingrese cedula del estudiante");
				cedulaIngresada=teclado2.nextLine();
				Estudiante cedulaEstudiante=new Estudiante();
				cedulaEstudiante.setCedula(cedulaIngresada);
				i=i+1;
				vector[i]=cedulaEstudiante;
				System.out.println("Se ha guardado la cedula");
			}else if(opcion==2) {
				System.out.println("Ingrese cedula a buscar");
				String cedulaDeBusqueda=teclado2.nextLine();
				if(cedulaIngresada==cedulaDeBusqueda) {
					System.out.println("Estudiante registrado");
					
				} else {
					System.out.println("El estudiante no esta registrado");
				}
				
			}

			
			
		}while(opcion!=3);
		System.out.println("Cerrando sistema");
		}
}