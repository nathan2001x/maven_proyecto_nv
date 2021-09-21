package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();// deprecada y ya deberia usarse
		
		LocalDate diaHoy=LocalDate.now();
		LocalDate diaFin=diaHoy.plusDays(15);
		
		System.out.println(diaHoy); // fecha actual impresa
		
		CursoVacacional curso1=new CursoVacacional();
		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		//aumentar 15 dias
		diaHoy.plusDays(15);
		curso1.setFechaFin(diaFin);
		
		System.out.println("Nombre"+curso1.getNombre());
		System.out.println("Fecha inicio:"+curso1.getFechaInicio());
		System.out.println("Fecha fin:"+curso1.getFechaFin());
		
		LocalDate diaHoy2=LocalDate.now();
		LocalDate diaQueInicio=diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza=diaHoy2.plusDays(20);

		
		CursoVacacional curso2=new CursoVacacional();
		curso2.setNombre("Natacion principiante");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("Nombre"+curso2.getNombre());
		System.out.println("Fecha inicio:"+curso2.getFechaInicio());
		System.out.println("Fecha fin:"+curso2.getFechaFin());
		
		//fechas especificas
		LocalDate fechaEspecifica= LocalDate.of(2022, 2,15);
		System.out.println(fechaEspecifica);
		
		// ejercicios
		LocalDate fechaEspecificaIni= LocalDate.of(2022, 2,15);
		LocalDate fechaEspecificaFin= LocalDate.of(2022, 7,10);
		
		CursoVacacional curso3=new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(diaQueInicio);
		curso3.setFechaFin(diaQueFinaliza);
		
		LocalDate fechaVista=curso3.getFechaFin();
		LocalDate fechaVistaNueva=fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre"+curso3.getNombre());
		System.out.println("Fecha inicio:"+curso3.getFechaInicio());
		System.out.println("Fecha fin:"+curso3.getFechaFin());
		
	}

}
