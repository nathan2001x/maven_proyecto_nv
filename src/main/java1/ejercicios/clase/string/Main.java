package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// 1 contains
		// String clase utilitaria para manejo de cadenas
		String frase = "Programacion de algoritmos modulo II";

		System.out.println("Ingrese el nombre del libro");
		String palabra = teclado.nextLine();

		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la plabra: " + resultado);

		// 2 equals
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String cadena1 = "nathan";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: " + resultado2);

		// 3 y 4 Upper Lower
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: " + nombreEnMayuscula);

		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en minuscula: " + nombreEnMinuscula);
		
		System.out.println("Valor estatico 1:"+provincia);
		System.out.println("Valor estatico 2:"+canton);


	}

}
