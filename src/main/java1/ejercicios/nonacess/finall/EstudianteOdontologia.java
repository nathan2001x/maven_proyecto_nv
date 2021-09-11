package ejercicios.nonacess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{
	
	//no se puede sobreescribir metodos final de clase padre
	public void realizarPracticas() {
		System.out.println("Realiza 100 horas de practicas");
	}

	protected void realizarPasantias() {
		System.out.println("Realiza 200 horas de pasantias");
	}
}
