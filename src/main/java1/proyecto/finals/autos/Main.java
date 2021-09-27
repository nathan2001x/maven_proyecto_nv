package proyecto.finals.autos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import deber.metodos.string.Estudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		Scanner teclado5 = new Scanner(System.in);
		Scanner teclado6 = new Scanner(System.in);
		

		int opcion, opcionTipo;
		String opcionClientes, opcionEmpleado, opcionAlquiler, opcionAplazo;
		String placa="";
		String cedula = "";
		String modelo = "",marca="";
		
		List<Autos> lista = new ArrayList<Autos>();
		Autos auto = new Autos();
		LocalDate diaHoy=LocalDate.now();

		do {
			System.out.println("**********************");
			System.out.println("Sistema Metrocard     ");
			System.out.println("1.Clientes            ");
			System.out.println("2.Empleado            ");
			System.out.println("3.Salir               ");
			System.out.println("**********************");
			opcion = teclado.nextInt();
			if (opcion == 1) {
				System.out.println("*****************");
				System.out.println("a.Consultar autos");
				System.out.println("b.Reservar autos");
				System.out.println("*****************");
				opcionClientes = teclado1.nextLine();
				if (opcionClientes.equals("a")) {
					System.out.println("Ingrese modelo del auto");
					String modeloIngresado = teclado5.nextLine();
					System.out.println("Ingrese marca del auto");
					String marcaIngresada = teclado5.nextLine();
					
					if(modeloIngresado.equals(modelo)&&marcaIngresada.equals(marca)) {
						System.out.println(lista);
					}else {
						System.out.println("El auto no esta registrado");
					}
				} else if (opcionClientes.equals("b")) {
					System.out.println("Ingrese placa del auto a reservar");
					String placaReserva = teclado4.nextLine();
					System.out.println("Ingrese su cedula");
					cedula = teclado4.nextLine();
					if(placaReserva.equals(placa)) {
						auto.setEstadoAuto("Reservado");
						diaHoy.plusDays(2);
						System.out.println("El auto esta reservado correctamente dirijase al patio de autos");
					} else {
						LocalDate diaFin=LocalDate.now();
								diaFin.plusDays(3);
						System.out.println("El auto no esta disponible y la fecha disponible es: "+diaFin);
						
					}
					

				}

			} else if (opcion == 2) {
				System.out.println("***************************");
				System.out.println("a.Ingresar un auto");
				System.out.println("b.Alquilar  un auto");
				System.out.println("c.Aplazar fecha de entrega");
				System.out.println("***************************");
				opcionEmpleado = teclado2.nextLine();
				if (opcionEmpleado.equals("a")) {
					System.out.println("Ingrese placa del auto");
					placa = teclado4.nextLine();
					auto.setPlaca(placa);
					System.out.println("Ingrese modelo del auto");
					modelo = teclado4.nextLine();
					auto.setModelo(modelo);
					System.out.println("Ingrese marca del auto");
					marca = teclado4.nextLine();
					auto.setMarca(marca);
					System.out.println("Ingrese año de fabricacion del auto");
					String anioAuto = teclado4.nextLine();
					auto.setAnioAuto(anioAuto);
					System.out.println("Ingrese pais de fabricacion del auto");
					String pais = teclado4.nextLine();
					auto.setPais(pais);
					System.out.println("Ingrese cilindaje del auto");
					String cilindraje = teclado4.nextLine();
					auto.setCilindraje(cilindraje);
					System.out.println("Ingrese avaluo(precio) del auto");
					String precio = teclado4.nextLine();
					auto.setPrecio(precio);
					System.out.println("Que tipo de auto es ??");
					System.out.println("1.Automovil");
					System.out.println("2.Camioneta");
					opcionTipo = teclado3.nextInt();
					if (opcionTipo == 1) {
						System.out.println("Ingrese numero de puertas");
						String numeroPuertas = teclado4.nextLine();
						auto.setNumeroPuertas(numeroPuertas);
						auto.setEstadoAuto("Disponible");
						lista.add(auto);
					} else if (opcionTipo == 2) {
						System.out.println("Ingrese peso que soporta el auto");
						String peso = teclado4.nextLine();
						auto.setPesoCamioneta(peso);
						auto.setEstadoAuto("Disponible");
						lista.add(auto);
						
					}
					
					
					System.out.println("Se ha guardado exitosamente el auto ingresado");

				} else if (opcionEmpleado.equals("b")) {
					System.out.println("Ingrese placa del auto");
					String placaIngresada=teclado6.nextLine();
					if(placaIngresada.equals(placa)) {
						System.out.println(auto.getPlaca());
						System.out.println(auto.getModelo());
						System.out.println(auto.getEstadoAuto());
						System.out.println(auto.getFechaEntrega());
						System.out.print("Reservado por:"+cedula);
						
						System.out.println("Elija una opcion");
						System.out.println("a.Alquilar");
						System.out.println("b.No alquilar");
						opcionAlquiler = teclado4.nextLine();
						if (opcionAlquiler.equals("a")) {
							auto.setEstadoAuto("Alquilado");
							LocalDate diaHoy1=LocalDate.now();
							diaHoy1.plusDays(2);
							System.out.println("La fecha del auto a entregar es:"+diaHoy1);
						} else if (opcionAlquiler.equals("b")) {
							System.out.println("El auto no se ha alquilado");
						}
						
					}
					System.out.println("El auto no se ha registrado");
					
				} else if (opcionEmpleado.equals("c")) {
					System.out.println("Ingrese la placa del auto");
					String placaIngresada=teclado6.nextLine();
					System.out.println("Ingrese su cedula del cliente que alquilo el auto");
					String cedulaIngresada=teclado6.nextLine();
					if(placaIngresada.equals(placa)&&cedulaIngresada.equals(cedula)) {
						System.out.print(auto.getPlaca());
						System.out.print(auto.getModelo());
						System.out.print(auto.getEstadoAuto());
						System.out.print(auto.getFechaEntrega());
						System.out.print("Alquilado por:"+cedula);
						System.out.println("Elija una opcion");
						System.out.println("a.Aplazar");
						System.out.println("b.No aplazar");
						opcionAplazo = teclado4.nextLine();
						if (opcionAplazo.equals("a")) {
							diaHoy.plusDays(3);
							System.out.println("El auto a sido aplazado 3 dias adicionales a la fecha de entrega:"+diaHoy);
						} else if (opcionAplazo.equals("b")) {
							System.out.println("La fecha no ha sido aplazada");
						}
						
					}else {
						System.out.println("El auto no ha sido encontrado");
					}
					
				}

			}
		} while (opcion != 3);
		System.out.println("Cerrando sistema");

	}

	

	
}